package codeWars.kyu7.greatestCommonDivisor_20200927;

public class GCD {

  public static int compute(int x, int y) {
    if (y == 0) {
      return x;
    }
    return compute(y, x % y);
  }
}
