package codeWars.kyu7.sumOfArraySingles_20201027;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static int repeats(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (list.contains(arr[i])) {
        list.remove(Integer.valueOf(arr[i]));
      } else {
        list.add(arr[i]);
      }
    }
    return list.stream().mapToInt(x -> x).sum();
  }
}
