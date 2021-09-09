package programmers.joyStick;

import java.util.Arrays;

public class Solution {

  boolean[] visited;
  int currentIndex = 0;

  public int solution(String name) {
    char[] result = new char[name.length()];
    Arrays.fill(result, 'A');
    visited = getVisitedArray(name);

    int joyStickCount = 0;
    while (!String.valueOf(result).equals(name)) {
      joyStickCount += addLeftOrRightCount(name);
      joyStickCount += addUpOrDownCount(name.charAt(currentIndex));
      result[currentIndex] = name.charAt(currentIndex);
      visited[currentIndex] = true;
    }

    return joyStickCount;
  }

  private int addLeftOrRightCount(String name) {
    int leftIndex = currentIndex;
    int leftMoveCount = 0;
    while (visited[leftIndex]) {
      leftIndex = leftIndex == 0 ? name.length() - 1 : leftIndex - 1;
      leftMoveCount++;
    }

    int rightIndex = currentIndex;
    int rightMoveCount = 0;
    while (visited[rightIndex]) {
      rightIndex = rightIndex == name.length() - 1 ? 0 : rightIndex + 1;
      rightMoveCount++;
    }

    if (rightMoveCount <= leftMoveCount) {
      currentIndex = rightIndex;
      return rightMoveCount;
    } else {
      currentIndex = leftIndex;
      return leftMoveCount;
    }
  }

  private boolean[] getVisitedArray(String name) {
    boolean[] result = new boolean[name.length()];
    for (int i = 0; i < result.length; i++) {
      result[i] = name.charAt(i) == 'A';
    }
    return result;
  }

  private int addUpOrDownCount(char alphabet) {
    if (alphabet > 'N') {
      return 'Z' - alphabet + 1;
    }
    return alphabet - 'A';
  }
}
