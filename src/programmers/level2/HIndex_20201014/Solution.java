package programmers.level2.HIndex_20201014;

import java.util.Arrays;

public class Solution {

  public int solution(int[] citations) {
    Arrays.sort(citations);
    int result = 0;
    for (int i = 0; i < citations.length; i++) {
      if (citations.length - i <= citations[i]) {
        return citations.length - i;
      }
    }
    return result;
  }
}
