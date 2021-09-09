package codeWars.kyu7.arrayLeader_20210222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static List arrayLeaders(int[] numbers) {
    List<Integer> results = new ArrayList<>();
    int sum = Arrays.stream(numbers).sum();

    for (int i = 0; i < numbers.length; i++) {
      sum -= numbers[i];
      if (numbers[i] > sum) {
        results.add(numbers[i]);
      }
    }

    return results;
  }
}
