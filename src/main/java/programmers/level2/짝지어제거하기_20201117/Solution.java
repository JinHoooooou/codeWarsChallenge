package programmers.level2.짝지어제거하기_20201117;

import java.util.Stack;

public class Solution {

  public int solution(String s) {
    Stack<Character> alphabetStack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char alphabet = s.charAt(i);

      if (!alphabetStack.isEmpty() && alphabetStack.peek() == alphabet) {
        alphabetStack.pop();
      } else {
        alphabetStack.add(alphabet);
      }
    }
    return alphabetStack.isEmpty() ? 1 : 0;
  }
}
