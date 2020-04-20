package isNumberPrime_20200419;

import java.math.BigInteger;

public class Prime {

  public static boolean isPrime(int num) {
    return num > 1 && BigInteger.valueOf(num).isProbablePrime(42);
  }
}
