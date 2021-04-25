package baekjoon.DFS와BFS.나이트의이동_7562_20210425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static int[] yPoint = {-2, -2, -1, 1, 2, 2, 1, -1};
  private static int[] xPoint = {-1, 1, 2, 2, 1, -1, -2, -2};


  public static void main(String[] args) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    int testCase = Integer.parseInt(tokenizer.nextToken());

    for (int i = 0; i < testCase; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int mapSize = Integer.parseInt(tokenizer.nextToken());
      int[][] map = new int[mapSize][mapSize];

      tokenizer = new StringTokenizer(READER.readLine());
      int[] start = {Integer.parseInt(tokenizer.nextToken()),
          Integer.parseInt(tokenizer.nextToken()), 0};
      tokenizer = new StringTokenizer(READER.readLine());
      int[] destination = {Integer.parseInt(tokenizer.nextToken()),
          Integer.parseInt(tokenizer.nextToken())};

      System.out.println(bfs(map, start, destination));
    }
  }

  private static int bfs(int[][] map, int[] start, int[] destination) {
    boolean[][] visit = new boolean[map.length][map.length];
    Queue<int[]> queue = new LinkedList<>();
    queue.add(start);

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      if (visit[current[0]][current[1]]) {
        continue;
      }
      if (current[0] == destination[0] && current[1] == destination[1]) {
        return current[2];
      }
      visit[current[0]][current[1]] = true;

      for (int i = 0; i < 8; i++) {
        int y = current[0] + yPoint[i];
        int x = current[1] + xPoint[i];
        int moveCount = current[2];
        if (y < 0 || y >= map.length) {
          continue;
        }
        if (x < 0 || x >= map.length) {
          continue;
        }
        if (!visit[y][x]) {
          queue.add(new int[]{y, x, moveCount + 1});
        }
      }
    }

    return 0;
  }
}
