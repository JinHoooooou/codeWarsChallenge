package baekjoon.DFS와BFS.섬의개수_4963_20210524;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {

    StringBuilder result = new StringBuilder();
    while (true) {
      tokenizer = new StringTokenizer(READER.readLine());
      int col = Integer.parseInt(tokenizer.nextToken());
      int row = Integer.parseInt(tokenizer.nextToken());
      if (col == 0 && row == 0) {
        break;
      }

      int[][] map = buildMap(col, row);
      boolean[][] visit = new boolean[row][col];

      int islandCount = 0;
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if (map[i][j] == 1 && !visit[i][j]) {
            dfs(map, visit, i, j);
            islandCount++;
          }
        }
      }
      result.append(islandCount + "\n");
    }

    WRITER.write(result.toString());
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] buildMap(int col, int row) throws IOException {
    int[][] map = new int[row][col];

    for (int i = 0; i < row; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 0; j < col; j++) {
        map[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }
    return map;
  }

  private static void dfs(int[][] map, boolean[][] visit, int row, int col) {
    if (row < 0 || row >= map.length) {
      return;
    }
    if (col < 0 || col >= map[row].length) {
      return;
    }
    if (map[row][col] == 0) {
      return;
    }
    if (visit[row][col]) {
      return;
    }
    visit[row][col] = true;

    dfs(map, visit, row - 1, col - 1);
    dfs(map, visit, row - 1, col);
    dfs(map, visit, row - 1, col + 1);
    dfs(map, visit, row, col + 1);
    dfs(map, visit, row + 1, col + 1);
    dfs(map, visit, row + 1, col);
    dfs(map, visit, row + 1, col - 1);
    dfs(map, visit, row, col - 1);
  }
}
