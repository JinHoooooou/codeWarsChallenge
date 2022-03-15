package codewars._7kyu.Find_all_pairs_20220315;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static int duplicates(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int value : array) {
      map.put(value, map.getOrDefault(value, 0) + 1);
    }
    return map.values().stream().mapToInt(x -> x / 2).sum();

  }
}
