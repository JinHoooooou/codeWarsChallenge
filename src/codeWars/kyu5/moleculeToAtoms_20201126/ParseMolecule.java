package codeWars.kyu5.moleculeToAtoms_20201126;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

class ParseMolecule {

  public static Map<String, Integer> getAtoms(String formula) {
    if (!isCorrectAtoms(formula)) {
      throw new IllegalArgumentException();
    } else if (!isCorrectBracket(formula)) {
      throw new IllegalArgumentException();
    }
    formula = formula.replaceAll("[{\\[]", "(");
    formula = formula.replaceAll("[}\\]]", ")");
    String simpleFormula = simplify(formula);
    return getResultMap(simpleFormula);
  }

  private static boolean isCorrectBracket(String formula) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < formula.length(); i++) {
      char c = formula.charAt(i);
      if (c == '[' || c == '(' || c == '{') {
        stack.push(c);
      } else if (c == ']') {
        if (stack.isEmpty() || stack.pop() != '[') {
          return false;
        }
      } else if (c == ')') {
        if (stack.isEmpty() || stack.pop() != '(') {
          return false;
        }
      } else if (c == '}') {
        if (stack.isEmpty() || stack.pop() != '{') {
          return false;
        }
      }

    }
    return stack.isEmpty();
  }

  private static boolean isCorrectAtoms(String formula) {
    formula = formula.replaceAll("[({\\[)}\\]0-9]", "");
    String[] atoms = formula.split("");
    for (int i = 0; i < atoms.length; i++) {
      if (atoms[i].matches("[a-z]")) {
        if (i - 1 > 0 && atoms[i - 1].matches("[a-z]")) {
          return false;
        } else if (i + 1 < atoms.length && atoms[i + 1].matches("[a-z]")) {
          return false;
        }
      }
    }
    return true;
  }

  private static Map<String, Integer> getResultMap(String simpleFormula) {
    HashMap<String, Integer> map = new HashMap<>();
    String[] split = simpleFormula.split("");
    for (int i = 0; i < split.length; i++) {
      if (split[i].matches("[A-Z]")) {
        String atom = split[i];
        String number = "";
        if (i + 1 < split.length && split[i + 1].matches("[a-z]")) {
          atom += split[++i];
        }
        while (i + 1 < split.length) {
          if (split[i + 1].matches("[0-9]")) {
            number += split[i + 1];
            i++;
          } else {
            break;
          }
        }
        int count = number.isEmpty() ? 1 : Integer.parseInt(number);
        map.put(atom, map.getOrDefault(atom, 0) + count);
      }
    }
    return map;
  }

  private static String simplify(String formula) {
    String lastFormula = "";

    for (int i = 0; i < formula.length(); i++) {
      if (formula.charAt(i) == '(') {
        formula = formula.substring(0, i) + simplify(formula.substring(i + 1));
      } else if (formula.charAt(i) == ')') {
        String multiply = "";
        int index = i + 1;
        while (index < formula.length()) {
          if (String.valueOf(formula.charAt(index)).matches("[0-9]")) {
            multiply += formula.charAt(index++);
          } else {
            break;
          }
        }
        int defaultValue = multiply.isEmpty() ? 1 : Integer.parseInt(multiply);
        lastFormula = formula.substring(index);
        String target = formula.substring(0, i);
        formula = calculate(target, defaultValue) + lastFormula;
        break;
      }
    }
    return formula;
  }

  private static String calculate(String target, int defaultValue) {
    HashMap<String, Integer> map = new HashMap<>();
    String[] split = target.split("");
    for (int i = 0; i < split.length; i++) {
      if (split[i].matches("[A-Z]")) {
        String atom = split[i];
        String number = "";
        if (i + 1 < split.length && split[i + 1].matches("[a-z]")) {
          atom += split[++i];
        }
        while (i + 1 < split.length) {
          if (split[i + 1].matches("[0-9]")) {
            number += split[i + 1];
            i++;
          } else {
            break;
          }
        }
        int count = number.isEmpty() ? defaultValue : defaultValue * Integer.parseInt(number);
        map.put(atom, map.getOrDefault(atom, 0) + count);
      }
    }

    String result = "";
    for (Entry<String, Integer> entry : map.entrySet()) {
      result += entry.getKey() + entry.getValue();
    }

    return result;
  }
}