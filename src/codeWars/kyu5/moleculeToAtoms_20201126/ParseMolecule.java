package codeWars.kyu5.moleculeToAtoms_20201126;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParseMolecule {

  static final String ATOM_NUMBER_REGEX = "[A-Z][a-z]?\\d*";
  static final String OPEN_BRACKET_REGEX = "[({\\[]";
  static final String CLOSE_BRACKET_REGEX = "[)}\\]]\\d*";

  public static Map<String, Integer> getAtoms(String formula) {

    List<String> tokens = getTokens(formula);

    if (!String.join("", tokens).equals(formula)) {
      throw new IllegalArgumentException();
    }

    Stack<String> bracketStack = new Stack<>();
    Map<String, Integer> atomMap = splitMolecule(tokens, bracketStack);

    if (!bracketStack.isEmpty()) {
      throw new IllegalArgumentException();
    }

    return atomMap;
  }

  private static List<String> getTokens(String formula) {
    Matcher matcher = Pattern
        .compile(
            String.format("%s|%s|%s", ATOM_NUMBER_REGEX, OPEN_BRACKET_REGEX, CLOSE_BRACKET_REGEX))
        .matcher(formula);

    List<String> tokens = new ArrayList<>();
    while (matcher.find()) {
      tokens.add(matcher.group());
    }
    return tokens;
  }

  private static Map<String, Integer> splitMolecule(List<String> tokens, Stack<String> stack) {

    Map<String, Integer> map = new HashMap<>();
    while (!tokens.isEmpty()) {
      String token = tokens.remove(0);

      if (token.matches(ATOM_NUMBER_REGEX)) {
        addAtom(map, token);
      } else if (token.matches(OPEN_BRACKET_REGEX)) {
        stack.push(token);
        concatAtom(map, splitMolecule(tokens, stack));
      } else if (token.matches(CLOSE_BRACKET_REGEX)) {
        if (!isValidBracket(stack, token)) {
          throw new IllegalArgumentException();
        }
        if (token.length() > 1) {
          multiplyAtom(map, Integer.parseInt(token.substring(1)));
        }
        break;
      }
    }
    return map;
  }

  private static void multiplyAtom(Map<String, Integer> map, final int value) {
    map.forEach((atom, count) -> map.put(atom, count * value));
  }

  private static void concatAtom(Map<String, Integer> map, Map<String, Integer> internalMap) {
    internalMap.forEach((atom, count) -> map.put(atom, map.getOrDefault(atom, 0) + count));
  }

  private static void addAtom(Map<String, Integer> map, String token) {
    Pattern atomAndCountPattern = Pattern.compile("([A-Z][a-z]?)(\\d*)");
    Matcher matcher = atomAndCountPattern.matcher(token);
    if (matcher.find()) {
      String atom = matcher.group(1);
      int count = matcher.group(2).isEmpty() ? 1 : Integer.parseInt(matcher.group(2));
      map.put(atom, map.getOrDefault(atom, 0) + count);
    }
  }

  private static boolean isValidBracket(Stack<String> stack, String token) {
    if (stack.isEmpty()) {
      return false;
    }

    char closeBracket = token.charAt(0);
    if (stack.peek().equals("[") && closeBracket != ']') {
      return false;
    } else if (stack.peek().equals("{") && closeBracket != '}') {
      return false;
    } else if (stack.peek().equals("(") && closeBracket != ')') {
      return false;
    }
    stack.pop();
    return true;
  }
}