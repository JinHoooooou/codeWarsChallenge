package programmers.두개_뽑아_더하기;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Solution {

  Set<Integer> set;

  public int[] solution(int[] numbers) {
    set = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        set.add(numbers[i] + numbers[j]);
      }
    }
    return set.stream().sorted().mapToInt(Integer::intValue).toArray();
  }
}
