package codeWars.kyu6.RuleOfDivisibilityBy13_20200715;

public class Thirteen {

  public static int[] reminderBy13 = {1, 10, 9, 12, 3, 4};

  public static long thirt(long n) {
    String nToString;
    long result = n;
    long lastResult = 0;

    while (result != lastResult) {
      lastResult = result;
      result = 0;
      nToString = new StringBuilder(String.valueOf(lastResult)).reverse().toString();
      int index = 0;
      for (int i = 0; i < nToString.length(); i++) {
        result += (Character.getNumericValue(nToString.charAt(i)) * reminderBy13[index]);
        index = index == reminderBy13.length - 1 ? 0 : index + 1;
      }
    }
    return result;
  }
}
