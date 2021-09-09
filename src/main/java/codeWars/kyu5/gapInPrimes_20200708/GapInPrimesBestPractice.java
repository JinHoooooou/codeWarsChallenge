package codeWars.kyu5.gapInPrimes_20200708;

public class GapInPrimesBestPractice {

  public static long[] gap(int g, long m, long n) {
    long firstPrime = Long.MIN_VALUE;
    for (long i = m; i < n; i++) {
      if (isPrime(i)) {
        long secondPrime = i;
        if (secondPrime - firstPrime == g) {
          return new long[]{firstPrime, i};
        }
        firstPrime = secondPrime;
      }
    }

    return null;
  }

  private static boolean isPrime(long number) {
    for (long i = 2; i < Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
