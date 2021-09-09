package codeWars.kyu7.basicCalculator_20201010;

public class Calculator {

  public static Double calculate(final double numberOne, final String operator,
      final double numberTwo) {
    switch (operator) {
      case "+":
        return numberOne + numberTwo;
      case "-":
        return numberOne - numberTwo;
      case "*":
        return numberOne == 0 || numberTwo == 0 ? 0d : numberOne * numberTwo;
      case "/":
        return numberTwo == 0 ? null : numberOne / numberTwo;
      default:
        return null;
    }
  }
}
