package codeWars.kyu5.gapInPrimes_20200708;

public class GapInPrimesBestPractice {

  public static long[] gap(int g, long m, long n) {
    long last = Long.MIN_VALUE;
    for (long i = m; i < n; i++) {
      if (isPrime(i)) {
        if (i - last == g) {
          return new long[]{last, i};
        }
        last = i;
      }
    }

    return null;
  }

  private static boolean isPrime(long i) {
    for (long j = 2; j < i / 2; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
}
