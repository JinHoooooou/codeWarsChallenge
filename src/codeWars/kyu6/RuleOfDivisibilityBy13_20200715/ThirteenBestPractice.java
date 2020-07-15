package codeWars.kyu6.RuleOfDivisibilityBy13_20200715;

public class ThirteenBestPractice {

  public static int[] reminderBy13 = {1, 10, 9, 12, 3, 4};

  public static long thirt(long n) {
    long result = 0;
    long lastResult = n;
    int index = 0;
    while (lastResult != 0) {
      long element = (lastResult % 10) * (reminderBy13[index]);
      index = index == reminderBy13.length - 1 ? 0 : index + 1;
      lastResult /= 10;
      result += element;
    }

    return result == n ? result : thirt(result);
  }
}
