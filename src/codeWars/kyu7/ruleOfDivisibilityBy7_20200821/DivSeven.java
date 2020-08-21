package codeWars.kyu7.ruleOfDivisibilityBy7_20200821;

public class DivSeven {

  public static long[] seven(long m) {
    int count = 0;
    while (m > 99) {
      m = (m / 10) - (2 * (m % 10));
      count++;
    }
    return new long[]{m, count};
  }
}
