package codeWars.kyu7.makeFunctionThatDoesArithmetic_20200611;

public class ArithmeticFunction {

  public static final String ADD = "add";
  public static final String SUBTRACT = "subtract";
  public static final String MULTIPLY = "multiply";
  public static final String DIVIDE = "divide";


  public static int arithmetic(int a, int b, String operator) {
    switch (operator) {
      case ADD:
        return a + b;
      case SUBTRACT:
        return a - b;
      case MULTIPLY:
        return a * b;
      case DIVIDE:
        return a / b;
      default:
        return 0;
    }
  }
}
