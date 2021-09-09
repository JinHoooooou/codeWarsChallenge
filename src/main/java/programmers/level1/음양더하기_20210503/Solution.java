package programmers.level1.음양더하기_20210503;

public class Solution {

  public int solution(int[] absolutes, boolean[] signs) {
    int result = 0;
    for (int i = 0; i < absolutes.length; i++) {
      result = signs[i] ? result + absolutes[i] : result - absolutes[i];
    }
    return result;
  }
}
