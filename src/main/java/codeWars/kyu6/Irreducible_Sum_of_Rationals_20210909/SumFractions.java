package codeWars.kyu6.Irreducible_Sum_of_Rationals_20210909;

import java.util.Arrays;

public class SumFractions {

  public static String sumFractions(int[][] l) {
    if (l.length == 0) {
      return null;
    }
    int denominator = Arrays.stream(l).mapToInt(x -> x[1]).reduce(1, (a, b) -> a * b);
    int numerator = Arrays.stream(l).mapToInt(x -> x[0] * denominator / x[1]).sum();

    int gcd = gcd(denominator, numerator);
    return gcd == denominator ? String.valueOf(numerator / denominator)
        : String.format("[%s, %s]", numerator / gcd, denominator / gcd);
  }

  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
