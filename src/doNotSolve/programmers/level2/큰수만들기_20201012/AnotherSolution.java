package doNotSolve.programmers.level2.큰수만들기_20201012;

import java.util.Stack;

public class AnotherSolution {

  public String solution(String number, int k) {
    Stack<String> digits = new Stack<>();
    for (int i = 0; i < number.length(); i++) {
      String digit = number.charAt(i) + "";
      while (!digits.isEmpty() && digits.peek().compareTo(digit) < 0 && k-- > 0) {
        digits.pop();
      }
      digits.push(digit);
    }
    String[] result = digits.toArray(new String[0]);
    return String.join("", result);
  }
}
