package codeWars.kyu6.stepsInPrimes_20210111;

public class StepInPrimes {

  public static long[] step(int g, long m, long n) {

    for (long num = m; num <= n - g; num++) {
      if (isPrime(num) && isPrime(num + g)) {
        return new long[]{num, num + g};
      }
    }
    return null;
  }

  private static boolean isPrime(long num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
