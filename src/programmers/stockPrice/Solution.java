package programmers.stockPrice;

public class Solution {

  public int[] solution(int[] prices) {
    int[] result = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
      int second = 0;
      for (int j = i + 1; j < prices.length; j++) {
        second++;
        if (prices[j] < prices[i]) {
          break;
        }
      }
      result[i] = second;
    }
    return result;
  }
}
