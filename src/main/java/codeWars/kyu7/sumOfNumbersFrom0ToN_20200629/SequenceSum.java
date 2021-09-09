package codeWars.kyu7.sumOfNumbersFrom0ToN_20200629;

public class SequenceSum {

  public static String showSequence(int value) {
    if (value < 0) {
      return value + "<0";
    }
    if (value == 0) {
      return value + "=0";
    }
    String result = "";
    int sum = 0;
    for (int i = 0; i <= value; i++) {
      sum += i;
      result += i + "+";
    }
    result = result.substring(0, result.length() - 1);
    result += " = " + sum;
    return result;
  }
}
