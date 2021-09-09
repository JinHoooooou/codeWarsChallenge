package doNotSolve.codewars.kyu4.hammingNumber_20201116;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hamming {

  static Set<Integer> primes;

  public static long hamming(int n) {
    List<Integer> hammings = new ArrayList<>();
    primes = new HashSet<>();
    hammings.add(1);

    int count = 1;
    int target = 2;
    while (count < n) {
      if (isNotMultipleOfPrime(target) && (target % 2 == 0 || target % 3 == 0 || target % 5 == 0)) {
        hammings.add(target);
        count++;
      }
      target++;
    }
    return hammings.get(n - 1);
  }

  private static boolean isNotMultipleOfPrime(int target) {
    if (target < 7) {
      return true;
    }
    if (isPrime(target)) {
      primes.add(target);
      return false;
    }
    if (isContainPrime(target)) {
      return false;
    }
    return true;
  }

  private static boolean isContainPrime(int target) {
    for (Integer prime : primes) {
      if (target % prime == 0) {
        return true;
      }
    }
    return false;
  }

  private static boolean isPrime(int target) {
    for (int i = 2; i <= Math.sqrt(target); i++) {
      if (target % i == 0) {
        return false;
      }
    }
    return true;
  }
}
