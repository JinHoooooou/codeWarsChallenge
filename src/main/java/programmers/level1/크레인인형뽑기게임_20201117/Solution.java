package programmers.level1.크레인인형뽑기게임_20201117;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

  public int solution(int[][] board, int[] moves) {
    List<Stack<Integer>> boardToList = buildStack(board);
    return getEraseCount(moves, boardToList);
  }

  private int getEraseCount(int[] moves, List<Stack<Integer>> boardToList) {
    Stack<Integer> result = new Stack<>();
    int count = 0;
    for (int i = 0; i < moves.length; i++) {
      int line = moves[i] - 1;
      if (boardToList.get(line).isEmpty()) {
        continue;
      }
      int target = boardToList.get(line).pop();
      if (result.isEmpty() || target != result.peek()) {
        result.add(target);
      } else {
        result.pop();
        count += 2;
      }
    }

    return count;
  }

  private List<Stack<Integer>> buildStack(int[][] board) {
    List<Stack<Integer>> boardToList = new ArrayList<>();

    for (int j = 0; j < board.length; j++) {
      Stack<Integer> lineStack = new Stack<>();
      for (int i = board.length - 1; i >= 0; i--) {
        if (board[i][j] != 0) {
          lineStack.add(board[i][j]);
        }
      }
      boardToList.add(lineStack);
    }
    return boardToList;
  }
}
