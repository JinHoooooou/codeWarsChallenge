package codeWars.kyu6.primorialOfNumber_20210123;

import java.math.BigInteger;

public class Primorial {

  public static String numPrimorial(int n) {
    int primeCount = 0;
    BigInteger result = BigInteger.ONE;
    for (long i = 2; i < 10000; i++) {
      if (isPrime(i)) {
        primeCount++;
        result = result.multiply(BigInteger.valueOf(i));
      }
      if (primeCount == n) {
        break;
      }
    }
    return result.toString();
  }

  private static boolean isPrime(long target) {
    for (int i = 2; i <= (int) Math.sqrt(target); i++) {
      if (target % i == 0) {
        return false;
      }
    }
    return true;
  }
}
