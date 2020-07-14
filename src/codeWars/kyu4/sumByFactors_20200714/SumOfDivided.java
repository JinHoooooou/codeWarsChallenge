package codeWars.kyu4.sumByFactors_20200714;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SumOfDivided {

  public static String sumOfDivided(int[] list) {
    Map<Integer, Integer> primeSumMap = getPrimeSumMap(list);

    return getResultString(primeSumMap);
  }

  private static String getResultString(Map<Integer, Integer> primeSumMap) {
    String result = "";
    for (Entry<Integer, Integer> set : primeSumMap.entrySet()) {
      result += String.format("(%d %d)", set.getKey(), set.getValue());
    }
    return result;
  }

  private static Map<Integer, Integer> getPrimeSumMap(int[] list) {
    Map<Integer, Integer> primeSumMap = new TreeMap<>();
    for (int target : list) {
      updateValue(primeSumMap, target);
    }
    return primeSumMap;
  }

  private static void updateValue(Map<Integer, Integer> primeSumMap, int value) {
    int target = Math.abs(value);
    int primeKey = 2;
    while (target > 1) {
      if (target % primeKey == 0) {
        primeSumMap.put(primeKey, primeSumMap.getOrDefault(primeKey, 0) + value);
        target = deletePrime(target, primeKey);
      } else if (isPrime(target)) {
        primeSumMap.put(target, primeSumMap.getOrDefault(target, 0) + value);
        break;
      }
      primeKey++;
    }
  }

  private static int deletePrime(int splitPrime, int prime) {
    while (splitPrime % prime == 0) {
      splitPrime /= prime;
    }
    return splitPrime;
  }

  private static boolean isPrime(int number) {
    if (number == 0 || number == 1) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
