package baekjoon.최단경로.알고스팟_1261_20210518;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));

  private static int[] xPoint = {0, 0, 1, -1};
  private static int[] yPoint = {1, -1, 0, 0};
  private static int col;
  private static int row;

  public static void main(String[] args) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    col = Integer.parseInt(tokenizer.nextToken());
    row = Integer.parseInt(tokenizer.nextToken());
    int[][] map = new int[row][col];
    boolean[][] visit = new boolean[row][col];

    for (int i = 0; i < row; i++) {
      String line = READER.readLine();
      for (int j = 0; j < col; j++) {
        map[i][j] = line.charAt(j) - '0';
      }
    }

    int min = bfs(map, visit);

    WRITER.write(min + "\n");

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int bfs(int[][] map, boolean[][] visit) {

    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
    queue.add(new int[]{0, 0, 0});

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int currentY = current[0];
      int currentX = current[1];
      if (currentY == row - 1 && currentX == col - 1) {
        return current[2];
      }
      if (visit[currentY][currentX]) {
        continue;
      }
      visit[currentY][currentX] = true;

      for (int i = 0; i < 4; i++) {
        int nextY = current[0] + yPoint[i];
        int nextX = current[1] + xPoint[i];
        if ((nextY < 0 || nextY >= row) || (nextX < 0 || nextX >= col)) {
          continue;
        }
        if (!visit[nextY][nextX]) {
          queue.add(map[nextY][nextX] == 1
              ? new int[]{nextY, nextX, current[2] + 1}
              : new int[]{nextY, nextX, current[2]});
        }
      }
    }
    return 0;
  }
}
