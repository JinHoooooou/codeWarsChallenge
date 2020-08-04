package SWExpertAcademy.grating_2819;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  static Set<String> resultSet;

  public static int solution(int[][] board) {
    resultSet = new HashSet<>();
    for (int y = 0; y < board.length; y++) {
      for (int x = 0; x < board[y].length; x++) {
        dfs(board, y, x, "");
      }
    }
    return resultSet.size();
  }

  private static void dfs(int[][] board, int y, int x, String current) {
    if (x < 0 || x > 3) {
      return;
    }
    if (y < 0 || y > 3) {
      return;
    }
    if (current.length() == 7) {
      resultSet.add(current);
      return;
    }

    dfs(board, y, x + 1, current + board[y][x]);
    dfs(board, y, x - 1, current + board[y][x]);
    dfs(board, y - 1, x, current + board[y][x]);
    dfs(board, y + 1, x, current + board[y][x]);
  }
}
