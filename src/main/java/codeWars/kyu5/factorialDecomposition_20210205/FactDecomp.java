package codeWars.kyu5.factorialDecomposition_20210205;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FactDecomp {


  public static String decomp(int n) {
    Map<Integer, Integer> primeCount = getPrimeCountsMap(n);
    return getResultString(primeCount);
  }

  private static Map<Integer, Integer> getPrimeCountsMap(int n) {
    Map<Integer, Integer> primeCount = new LinkedHashMap<>();

    for (int number = 2; number <= n; number++) {
      if (isPrime(number)) {
        primeCount.put(number, 1);
      } else {
        factorization(primeCount, number);
      }
    }
    return primeCount;
  }

  private static boolean isPrime(int number) {
    for (int i = 2; i <= (int) Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static void factorization(Map<Integer, Integer> primeCount,
      int number) {
    int target = number;

    for (int prime : primeCount.keySet()) {
      if (target == 1) {
        break;
      }
      int count = 0;
      while (target % prime == 0) {
        count++;
        target /= prime;
      }
      primeCount.put(prime, primeCount.get(prime) + count);
    }
  }

  private static String getResultString(Map<Integer, Integer> primeCount) {
    StringBuilder result = new StringBuilder();
    for (Entry<Integer, Integer> entry : primeCount.entrySet()) {
      result.append(entry.getKey());
      if (entry.getValue() != 1) {
        result.append("^").append(entry.getValue());
      }
      result.append(" * ");
    }

    return result.substring(0, result.length() - 3);
  }
}
