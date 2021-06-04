package baekjoon.DFS와BFS.영역구하기_2583_20210604;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int row;
  private static int col;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    row = Integer.parseInt(tokenizer.nextToken());
    col = Integer.parseInt(tokenizer.nextToken());
    int rectangleCount = Integer.parseInt(tokenizer.nextToken());
    int[][] map = buildMap(rectangleCount);

    boolean[][] visit = new boolean[row][col];
    int area = 0;
    List<Integer> areaSizes = new ArrayList<>();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (!visit[i][j] && map[i][j] != -1) {
          areaSizes.add(bfs(map, visit, i, j));
          area++;
        }
      }
    }

    String result = area + "\n";
    result += areaSizes.stream().sorted()
        .map(String::valueOf)
        .collect(Collectors.joining(" "));

    WRITER.write(result + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] buildMap(int rectangleCount) throws IOException {
    int[][] map = new int[row][col];

    for (int i = 0; i < rectangleCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int x1 = Integer.parseInt(tokenizer.nextToken());
      int y1 = Integer.parseInt(tokenizer.nextToken());
      int x2 = Integer.parseInt(tokenizer.nextToken());
      int y2 = Integer.parseInt(tokenizer.nextToken());

      for (int y = y1; y < y2; y++) {
        for (int x = x1; x < x2; x++) {
          map[y][x] = -1;
        }
      }
    }
    return map;
  }

  private static Integer bfs(int[][] map, boolean[][] visit, int startY, int startX) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{startY, startX});
    int[] yPoint = {1, -1, 0, 0};
    int[] xPoint = {0, 0, 1, -1};
    int areaSize = 0;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      if (visit[current[0]][current[1]]) {
        continue;
      }
      visit[current[0]][current[1]] = true;
      areaSize++;

      for (int i = 0; i < 4; i++) {
        int y = current[0] + yPoint[i];
        int x = current[1] + xPoint[i];
        if (isOutOfBound(y, x)) {
          continue;
        }
        if (!visit[y][x] && map[y][x] != -1) {
          queue.add(new int[]{y, x});
        }
      }
    }
    return areaSize;
  }

  private static boolean isOutOfBound(int y, int x) {

    return (y < 0 || y >= row) || (x < 0 || x >= col);
  }
}
