package programmers.level1.같은숫자는싫어_20201010;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    int last = arr[0];
    for (int element : arr) {
      if (element != last) {
        list.add(last);
      }
      last = element;
    }
    list.add(last);
    return list.stream().mapToInt(x -> x).toArray();
  }
}
