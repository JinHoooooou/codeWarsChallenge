package programmers.level1.수박수박수박_20201019;

public class Solution {

  public String solution(int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append("수박");
    }
    return result.substring(0, n);
  }
}
