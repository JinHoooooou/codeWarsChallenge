package programmers.carpet;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int[] solution(int brown, int yellow) {
    int area = brown + yellow;

    for (int vertical = 1; vertical <= area / 2; vertical++) {
      if (area % vertical == 0) {
        int horizon = area / vertical;
        if ((horizon - 2) * (vertical - 2) == yellow) {
          return new int[]{horizon, vertical};
        }
      }
    }

    return new int[]{0, 0};
  }
}
