package codewars._7kyu.Find_the_Squares_20220228;

import java.math.BigInteger;

public class Solution {

  public static String findSquares(int n) {
    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.ZERO;

    while (!(a.pow(2)).subtract(b.pow(2)).equals(BigInteger.valueOf(n))) {
      a = a.add(BigInteger.ONE);
      b = b.add(BigInteger.ONE);
    }
    return (a.pow(2).toString()) + "-" + (b.pow(2).toString());
  }

  public static String findSquaresBestPractice(int n) {
    final long a = (n + 1) / 2;
    final long b = a - 1;
    return String.format("%d-%d", a * a, b * b);
  }


}
