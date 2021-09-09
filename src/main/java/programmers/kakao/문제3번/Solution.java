package programmers.kakao.문제3번;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

  public String solution(int n, int k, String[] cmd) {
    Stack<Character> deletes = new Stack<>();
    List<Character> list = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      list.add((char) ('A' + i));
    }
    int current = k;
    for (int i = 0; i < cmd.length; i++) {
      char command = cmd[i].charAt(0);
      if (command == 'U') {
        current -= (cmd[i].charAt(2) - '0');
      } else if (command == 'D') {
        current += (cmd[i].charAt(2) - '0');
      } else if (command == 'C') {
        deletes.add(list.remove(current));
        if (current >= list.size()) {
          current = list.size() - 1;
        }
      } else {
        list.add(current, deletes.pop());
      }
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(deletes.contains((char) ('A' + i)) ? "X" : "O");
    }
    return result.toString();
  }

  private int moves(boolean[] state, int current, char command, char number) {
    int moveCount = number - '0';
    while (moveCount > 0) {
      current = command == 'D' ? current + 1 : current - 1;
      moveCount = state[current] ? moveCount - 1 : moveCount;
    }
    return current;
  }
}
