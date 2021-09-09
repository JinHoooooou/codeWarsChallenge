package programmers.tower;

import java.util.Stack;
import javafx.util.Pair;

public class AnotherSolution {

  public int[] solution(int[] heights) {

    int[] result = new int[heights.length];
    Stack<Pair<Integer, Integer>> towerStack = new Stack<>();
    for (int i = 0; i < heights.length; i++) {
      Pair<Integer, Integer> locationAndHeight = new Pair<>(i + 1, heights[i]);
      while (!towerStack.isEmpty()) {
        if (locationAndHeight.getValue() < towerStack.peek().getValue()) {
          result[i] = towerStack.peek().getKey();
          break;
        }
        towerStack.pop();
      }
      towerStack.push(locationAndHeight);
    }
    return result;
  }
}
