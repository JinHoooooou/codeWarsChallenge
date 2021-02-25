package codeWars.kyu6.transformToPrime_20210225;

import java.util.Arrays;

public class Solution {

  public static int minimumNumber(int[] numbers) {
    int sum = Arrays.stream(numbers).sum();
    for (int i = 0; ; i++) {
      if (isPrime(sum + i)) {
        return i;
      }
    }
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
