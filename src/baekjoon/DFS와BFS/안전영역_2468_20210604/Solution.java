package baekjoon.DFS와BFS.안전영역_2468_20210604;

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
  private static int length;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    length = Integer.parseInt(tokenizer.nextToken());
    int[][] map = new int[length][length];

    int maxHeight = Integer.MIN_VALUE;
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 0; j < length; j++) {
        int height = Integer.parseInt(tokenizer.nextToken());
        map[i][j] = height;
        maxHeight = Math.max(maxHeight, height);
      }
    }

    int maxSafeZone = Integer.MIN_VALUE;
    for (int i = 0; i <= maxHeight; i++) {
      boolean[][] visit = new boolean[length][length];
      int safeZone = 0;

      for (int j = 0; j < length; j++) {
        for (int k = 0; k < length; k++) {
          if (!visit[j][k] && map[j][k] > i) {
            dfs(map, visit, j, k, i);
            safeZone++;
          }
        }
      }
      maxSafeZone = Math.max(maxSafeZone, safeZone);
    }

    WRITER.write(maxSafeZone + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();

  }

  private static void dfs(int[][] map, boolean[][] visit, int y, int x, int waterHeight) {
    if (y < 0 || y >= length) {
      return;
    }
    if (x < 0 || x >= length) {
      return;
    }
    if (map[y][x] <= waterHeight) {
      return;
    }
    if (visit[y][x]) {
      return;
    }
    visit[y][x] = true;

    dfs(map, visit, y + 1, x, waterHeight);
    dfs(map, visit, y - 1, x, waterHeight);
    dfs(map, visit, y, x + 1, waterHeight);
    dfs(map, visit, y, x - 1, waterHeight);
  }
}
