package codeWars.kyu6.sumConsecutive_20201007;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Consecutives {

  public static List<Integer> sumConsecutives(List<Integer> s) {
    LinkedList<Integer> result2 = new LinkedList<>();
    int pre = Integer.MAX_VALUE;
    for (Integer value : s) {
      result2.add(value == pre ? result2.pollLast() + value : value);
      pre = value;
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < s.size(); i++) {
      int sameValueIndex;
      for (sameValueIndex = i; sameValueIndex < s.size(); sameValueIndex++) {
        if (!s.get(i).equals(s.get(sameValueIndex))) {
          break;
        }
      }
      result.add(s.get(i) * (sameValueIndex - i));
      i = sameValueIndex - 1;
    }
    return result;
  }
}
