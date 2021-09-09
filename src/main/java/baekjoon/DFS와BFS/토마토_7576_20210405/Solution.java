package baekjoon.DFS와BFS.토마토_7576_20210405;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

  private static int[][] map;
  private static int[] yPoint = {1, -1, 0, 0};
  private static int[] xPoint = {0, 0, 1, -1};
  private static int col;
  private static int row;

  public static void main(String[] args) {
    enterInput();

    bfs();

    printResult();
  }

  private static void enterInput() {
    Scanner scanner = new Scanner(System.in);
    col = scanner.nextInt();
    row = scanner.nextInt();

    map = new int[row][col];
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        map[i][j] = scanner.nextInt();
      }
    }
  }

  private static void printResult() {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (map[i][j] == 0) {
          System.out.println(-1);
          return;
        }
        max = Math.max(max, map[i][j]);
      }
    }
    System.out.println(max - 1);
  }

  private static void bfs() {
    Queue<int[]> queue = addStartPoint();

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      for (int i = 0; i < 4; i++) {
        int y = current[0] + yPoint[i];
        int x = current[1] + xPoint[i];
        if (isOutOfBound(y, x)) {
          continue;
        }
        if (map[y][x] != 0) {
          continue;
        }
        map[y][x] = map[current[0]][current[1]] + 1;
        queue.add(new int[]{y, x});
      }
    }
  }

  private static Queue<int[]> addStartPoint() {
    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (map[i][j] == 1) {
          queue.add(new int[]{i, j});
        }
      }
    }

    return queue;
  }

  private static boolean isOutOfBound(int y, int x) {
    return (y < 0 || y >= row) || (x < 0 || x >= col);
  }
}
