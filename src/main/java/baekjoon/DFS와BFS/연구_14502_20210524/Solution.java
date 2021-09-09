package baekjoon.DFS와BFS.연구_14502_20210524;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int maxSafeZone = Integer.MIN_VALUE;
  private static int row;
  private static int col;
  private static int[] yPoint = {1, -1, 0, 0};
  private static int[] xPoint = {0, 0, 1, -1};

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    row = Integer.parseInt(tokenizer.nextToken());
    col = Integer.parseInt(tokenizer.nextToken());
    int[][] map = buildMap();

    setWall(map, 0);

    WRITER.write(maxSafeZone + "");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] buildMap() throws IOException {
    int[][] map = new int[row][col];
    for (int i = 0; i < row; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 0; j < col; j++) {
        map[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }
    return map;
  }

  private static void setWall(int[][] map, int wallCount) {
    if (wallCount == 3) {
      int[][] virusMap = spreadVirus(map);
      int safeZone = countSafeZone(virusMap);
      maxSafeZone = Math.max(safeZone, maxSafeZone);
      return;
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (map[i][j] == 0) {
          map[i][j] = 1;
          setWall(map, wallCount + 1);
          map[i][j] = 0;
        }
      }
    }
  }

  private static int countSafeZone(int[][] map) {
    int count = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (map[i][j] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  private static int[][] spreadVirus(int[][] map) {
    int[][] copyMap = copy2DArray(map);
    boolean[][] visit = new boolean[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (copyMap[i][j] == 2 && !visit[i][j]) {
          bfs(copyMap, visit, i, j);
        }
      }
    }
    return copyMap;
  }

  private static void bfs(int[][] map, boolean[][] visit, int startY, int startX) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{startY, startX});
    visit[startY][startX] = true;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();

      for (int i = 0; i < 4; i++) {
        int y = current[0] + yPoint[i];
        int x = current[1] + xPoint[i];

        if (isOutOfArray(y, x)) {
          continue;
        }
        if (map[y][x] == 0 && !visit[y][x]) {
          visit[y][x] = true;
          map[y][x] = 2;
          queue.add(new int[]{y, x});
        }
      }
    }
  }

  private static boolean isOutOfArray(int y, int x) {
    return (y < 0 || y >= row) || (x < 0 || x >= col);
  }

  private static int[][] copy2DArray(int[][] map) {
    return Arrays.stream(map)
        .map(int[]::clone)
        .toArray(int[][]::new);
  }
}
