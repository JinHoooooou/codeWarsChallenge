package codeWars.kyu7.simpleRemoveDuplicates_20201204;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

  public static int[] solve(int[] arr) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (set.contains(arr[i])) {
        set.remove(arr[i]);
      }
      set.add(arr[i]);
    }
    return set.stream().mapToInt(x -> x).toArray();
  }
}
