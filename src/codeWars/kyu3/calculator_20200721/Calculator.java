package codeWars.kyu3.calculator_20200721;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

  public static Double evaluate(String expression) {
    String[] elements = expression.split(" ");
    List<Double> numbers = getNumberList(expression);
    List<String> operations = getOperationList(expression);

    while (numbers.size() != 1) {
      int index = getMinIndex(operations);
      numbers.add(index,
          calculate(numbers.remove(index), numbers.remove(index), operations.remove(index)));
    }

    return numbers.get(0);
  }

  private static Double calculate(Double a, Double b, String operation) {
    switch (operation) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      default:
        return a / b;
    }
  }

  private static List<String> getOperationList(String expression) {
    List<String> operations = new ArrayList<>();
    for (String element : expression.split(" ")) {
      if (element.matches("[+*/\\-]")) {
        operations.add(element);
      }
    }
    return operations;
  }

  private static List<Double> getNumberList(String expression) {
    List<Double> numbers = new ArrayList<>();
    for (String element : expression.split(" ")) {
      if (!element.matches("[+*/\\-]")) {
        numbers.add(Double.parseDouble(element));
      }
    }
    return numbers;
  }

  private static int getMinIndex(List<String> operations) {
    if (operations.contains("*") && operations.contains("/")) {
      return Math.min(operations.indexOf("*"), operations.indexOf("/"));
    } else if (operations.contains("*")) {
      return operations.indexOf("*");
    } else if (operations.contains("/")) {
      return operations.indexOf("/");
    }
    return 0;
  }
}
