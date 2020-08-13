package programmers.carpet;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int brown, int yellow) {
    int area = brown + yellow;
    List<Integer> horizonList = new ArrayList<>();
    for (int i = 1; i <= area / 2; i++) {
      if (area % i == 0) {
        int horizon = i;
        int vertical = area / i;
        if (horizon >= vertical) {
          horizonList.add(horizon);
        }
      }
    }

    for (Integer i : horizonList) {
      if (area - ((i - 2) * ((area / i) - 2)) == brown) {
        return new int[]{i, area / i};
      }
    }
    return new int[]{0, 0};
  }
}
