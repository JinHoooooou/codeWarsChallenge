package codeWars.kyu6.sumConsecutive_20201007;

import java.util.LinkedList;
import java.util.List;

public class ConsecutivesBestPractice {

  public static List<Integer> sumConsecutives(List<Integer> s) {
    LinkedList<Integer> result = new LinkedList<>();
    int pre = Integer.MAX_VALUE;
    for (Integer value : s) {
      result.add(value == pre ? result.pollLast() + value : value);
      pre = value;
    }
    return result;
  }
}
