package programmers.poketmon;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int solution(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    return Math.min(set.size(), (nums.length / 2));
  }
}
