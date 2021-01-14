package codeWars.kyu4.findTheUnknownDigit_20210114;

import java.util.ArrayList;
import java.util.List;

public class Runes {

  public static int solveExpression(final String expression) {
    int missingDigit = -1;

    for (int i = 0; i < 10; i++) {
      if (!isValid(expression, i)) {
        continue;
      }
      String example = expression.replaceAll("\\?", i + "");
      String left = example.split("=")[0];
      String right = example.split("=")[1];
      int result = Integer.parseInt(right);

      List<Integer> numbers = getNumbers(left.split("[+\\-*]"));
      List<Character> operators = getOperators(left.split("^-?[\\d]+"));

      if (calculate(numbers, operators) == result) {
        missingDigit = i;
        break;
      }
    }

    return missingDigit;
  }

  private static int calculate(List<Integer> numbers, List<Character> operators) {
    char op = operators.remove(0);
    int a = numbers.remove(0);
    int b = numbers.remove(0);
    switch (op) {
      case '+':
        numbers.add(0, a + b);
        break;
      case '-':
        numbers.add(0, a - b);
        break;
      case '*':
        numbers.add(0, a * b);
        break;
    }
    return numbers.get(0);
  }

  private static boolean isValid(String expression, int replaceDigit) {
    if (expression.contains(replaceDigit + "")) {
      return false;
    }

    expression = expression.replaceAll("\\?", replaceDigit + "");

    String[] numbers = expression.split("[+\\-*=]");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i].matches("^0[0-9]+")) {
        return false;
      }
    }
    return true;
  }

  private static List<Character> getOperators(String[] split) {
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < split.length; i++) {
      if (!split[i].isEmpty()) {
        list.add(split[i].charAt(0));
      }
    }

    return list;
  }

  private static List<Integer> getNumbers(String[] split) {
    List<Integer> list = new ArrayList<>();

    int sign = 1;
    for (int i = 0; i < split.length; i++) {
      if (split[i].isEmpty()) {
        sign = -1;
        continue;
      }
      int value = Integer.parseInt(split[i]) * sign;
      list.add(value);
      sign = 1;
    }
    return list;
  }
}
