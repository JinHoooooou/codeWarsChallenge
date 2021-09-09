package programmers.level2.튜플_20201021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

  public int[] solution(String s) {
    String[] tuples = s.substring(2, s.length() - 2).split("},\\{");
    List<Integer> result = new ArrayList<>();
    Arrays.sort(tuples, Comparator.comparing(String::length));
    for (String tuple : tuples) {
      String[] nums = tuple.split(",");
      for (String number : nums) {
        int target = Integer.parseInt(number);
        if (!result.contains(Integer.parseInt(number))) {
          result.add(target);
        }
      }
    }
    return result.stream().mapToInt(x -> x).toArray();
  }
}
