package codeWars.kyu8.wilsonPrimes_20201116;

import java.math.BigInteger;

public class WilsonPrime {

  public static boolean am_i_wilson(double n) {
    if (n == 0 || n == 1) {
      return false;
    }

    BigInteger dividend = fac(n - 1).add(BigInteger.ONE);
    BigInteger divisor = BigInteger.valueOf((long) n).pow(2);
    return dividend.mod(divisor).intValue() == 0;
  }

  private static BigInteger fac(double n) {
    BigInteger result = BigInteger.ONE;
    for (BigInteger i = BigInteger.valueOf((long) n); i.compareTo(BigInteger.ZERO) > 0;
        i = i.subtract(BigInteger.ONE)) {
      result = result.multiply(i);
    }
    return result;
  }

}
