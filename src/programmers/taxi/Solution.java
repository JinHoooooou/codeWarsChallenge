package programmers.taxi;

import java.util.Arrays;

public class Solution {

  public int solution(int[] s) {
    Arrays.sort(s);
    int taxiCount = 0;
    int minIndex = 0;
    int maxIndex = s.length - 1;
    while (s[maxIndex] == 4) {
      maxIndex--;
      taxiCount++;
    }

    while (true) {
      int sum = s[maxIndex];
      while (sum + s[minIndex] <= 4) {
        sum += s[minIndex++];
      }
      maxIndex--;
      taxiCount++;
      if (maxIndex < minIndex) {
        break;
      }
    }
    return taxiCount;
  }
}