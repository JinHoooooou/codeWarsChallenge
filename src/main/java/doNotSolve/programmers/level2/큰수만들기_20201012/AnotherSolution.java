package doNotSolve.programmers.level2.큰수만들기_20201012;

import java.util.Stack;
import java.util.stream.Collectors;

public class AnotherSolution {

  public String solution(String number, int k) {
    Stack<Character> digits = new Stack<>();
    int exceptCount = 0;
    for (int i = 0; i < number.length(); i++) {
      char digit = number.charAt(i);
      while (!digits.isEmpty() && digits.peek() < digit && exceptCount < k) {
        exceptCount++;
        digits.pop();
      }
      digits.push(digit);
    }
    return digits.stream().map(String::valueOf).collect(Collectors.joining())
        .substring(0, number.length() - k);
  }
}
