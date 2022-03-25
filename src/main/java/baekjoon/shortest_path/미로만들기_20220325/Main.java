package baekjoon.shortest_path.미로만들기_20220325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  private static int[] yPoint = {1, -1, 0, 0};
  private static int[] xPoint = {0, 0, 1, -1};
  private static int[][] map;
  private static int[][] minWallChangeCounts;

  public static void main(String[] args) throws IOException {

    init();
    bfs();

    System.out.print(minWallChangeCounts[map.length - 1][map.length - 1]);
  }

  private static void bfs() {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{0, 0});
    minWallChangeCounts[0][0] = 0;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int y = current[0];
      int x = current[1];

      for (int i = 0; i < 4; i++) {
        int newY = y + yPoint[i];
        int newX = x + xPoint[i];

        if (newY < 0 || newY >= map.length || newX < 0 || newX >= map.length) {
          continue;
        }

        if (minWallChangeCounts[newY][newX] > minWallChangeCounts[y][x]) {
          minWallChangeCounts[newY][newX] =
              map[newY][newX] == 1 ? minWallChangeCounts[y][x] : minWallChangeCounts[y][x] + 1;
          queue.add(new int[]{newY, newX});
        }
      }
    }
  }

  private static void init() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    map = new int[n][n];
    minWallChangeCounts = new int[n][n];

    for (int i = 0; i < n; i++) {
      map[i] = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
      Arrays.fill(minWallChangeCounts[i], Integer.MAX_VALUE);
    }
  }
}
