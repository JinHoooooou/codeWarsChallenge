package codeWars.kyu5.primesInNumbers_20200627;

import java.util.Map;
import java.util.TreeMap;

public class PrimeDecomp {

  public static String factors(int n) {
    Map<Integer, Integer> primeCountMap = getPrimeMap(n);
    return getResultString(primeCountMap);
  }

  private static Map<Integer, Integer> getPrimeMap(int number) {
    Map<Integer, Integer> primeCountMap = new TreeMap<>();
    int prime = 2;
    while (number != 1) {
      while (number % prime == 0) {
        primeCountMap.put(prime, primeCountMap.getOrDefault(prime, 0) + 1);
        number /= prime;
      }
      prime++;
    }
    return primeCountMap;
  }

  private static String getResultString(Map<Integer, Integer> primeCountMap) {
    StringBuilder result = new StringBuilder();
    for (int key : primeCountMap.keySet()) {
      result.append("(" + key);
      if (primeCountMap.get(key) > 1) {
        result.append("**" + primeCountMap.get(key));
      }
      result.append(")");
    }
    return result.toString();
  }
}
