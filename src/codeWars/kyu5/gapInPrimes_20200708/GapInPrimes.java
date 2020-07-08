package codeWars.kyu5.gapInPrimes_20200708;

public class GapInPrimes {

  public static long[] gap(int g, long m, long n) {

    while (n - m >= g) {
      long firstPrime = getPrime(m, n);
      long secondPrime = getPrime(firstPrime + 1, n);
      if (secondPrime - firstPrime == g) {
        return new long[]{firstPrime, secondPrime};
      }
      m++;
    }
    return null;
  }

  private static long getPrime(long m, long n) {
    for (long i = m; i <= n; i++) {
      if (isPrime(i)) {
        return i;
      }
    }
    return 0;
  }

  private static boolean isPrime(long number) {
    int divisorCount = 0;
    for (int i = 1; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        divisorCount++;
      }
    }
    return divisorCount == 1;
  }
}
