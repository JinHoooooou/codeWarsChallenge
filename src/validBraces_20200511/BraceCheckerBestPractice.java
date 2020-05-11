package validBraces_20200511;

import java.util.Stack;

public class BraceCheckerBestPractice {

  public boolean isValid(String braces) {
    Stack<Character> s = new Stack<>();
    for (char c : braces.toCharArray()) {
      if (s.size() > 0 && isClosing(s.peek(), c)) {
        s.pop();
      } else {
        s.push(c);
      }
    }
    return s.size() == 0;
  }

  public boolean isClosing(char x, char c) {
    return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
  }
}
