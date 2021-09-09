package codeWars.kyu6.backwardsReadPrimes_20201110;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackWardsPrime {

  public static String backwardsPrime(long start, long end) {
    List<Long> primes = new ArrayList<>();
    for (long i = start; i <= end; i++) {
      if (isBackwardsPrime(i)) {
        primes.add(i);
      }
    }

    return primes.stream().map(String::valueOf).collect(Collectors.joining(" "));
  }

  private static boolean isBackwardsPrime(long number) {
    long reverse = getReverse(number);
    if (number < 10) {
      return false;
    }
    if (number == reverse) {
      return false;
    }
    return isPrime(number) && isPrime(reverse);
  }

  private static long getReverse(long number) {
    return Long.parseLong(new StringBuilder(String.valueOf(number)).reverse().toString());
  }

  private static boolean isPrime(long number) {
    for (long i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
