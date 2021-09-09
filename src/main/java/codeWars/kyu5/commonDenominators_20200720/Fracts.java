package codeWars.kyu5.commonDenominators_20200720;

public class Fracts {

  public static String convertFrac(long[][] lst) {
    if (lst.length == 0) {
      return "";
    }
    extractGcd(lst);
    long[][] fraction = getFraction(lst);

    return getResultString(fraction);
  }

  private static String getResultString(long[][] fraction) {
    String result = "";
    for (int i = 0; i < fraction.length; i++) {
      result += String.format("(%d,%d)", fraction[i][0], fraction[i][1]);
    }
    return result;
  }

  private static long[][] getFraction(long[][] lst) {
    long lcm = lst[0][1];
    for (int i = 1; i < lst.length; i++) {
      lcm = (lcm * lst[i][1]) / gcd(lcm, lst[i][1]);
    }
    for (int i = 0; i < lst.length; i++) {
      lst[i][0] *= lcm / lst[i][1];
      lst[i][1] = lcm;
    }
    return lst;
  }

  private static long[][] extractGcd(long[][] lst) {
    for (int i = 0; i < lst.length; i++) {
      long gcd = gcd(lst[i][0], lst[i][1]);
      lst[i][0] /= gcd;
      lst[i][1] /= gcd;
    }
    return lst;
  }

  private static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
