package baekjoon.DFS와BFS.적록색약_20210619;

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
  private static final int RED = 1;
  private static final int GREEN = 2;
  private static final int BLUE = 3;
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    int[][] map = buildMap(length);
    boolean[][] visit = new boolean[length][length];
    int areaCount = 0;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (!visit[i][j]) {
          dfs(map, visit, map[i][j], i, j);
          areaCount++;
        }
      }
    }
    result.append(areaCount + " ");

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (map[i][j] == GREEN) {
          map[i][j] = RED;
        }
      }
    }

    visit = new boolean[length][length];
    areaCount = 0;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (!visit[i][j]) {
          dfs(map, visit, map[i][j], i, j);
          areaCount++;
        }
      }
    }
    result.append(areaCount);

    WRITER.write(result.toString());
    WRITER.flush();
    WRITER.close();
    READER.close();
  }


  private static void dfs(int[][] map, boolean[][] visit, int color, int y, int x) {
    if (y < 0 || y >= map.length) {
      return;
    }
    if (x < 0 || x >= map.length) {
      return;
    }
    if (map[y][x] != color) {
      return;
    }
    if (visit[y][x]) {
      return;
    }
    visit[y][x] = true;

    dfs(map, visit, color, y + 1, x);
    dfs(map, visit, color, y - 1, x);
    dfs(map, visit, color, y, x + 1);
    dfs(map, visit, color, y, x - 1);
  }

  private static int[][] buildMap(int length) throws IOException {
    int[][] map = new int[length][length];
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      String pic = tokenizer.nextToken();
      for (int j = 0; j < length; j++) {
        map[i][j] = insertColor(pic.charAt(j));
      }
    }
    return map;
  }

  private static int insertColor(char color) {
    return color == 'R' ? RED : color == 'G' ? GREEN : BLUE;
  }
}
