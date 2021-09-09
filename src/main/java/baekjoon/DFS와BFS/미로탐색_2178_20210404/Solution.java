package baekjoon.DFS와BFS.미로탐색_2178_20210404;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

  //1. 재귀 DFS로 해결하려 했다 -> boolean[][] visit에 이미 방문한곳을 기록했기 때문에 막히는 현상발생
  //2. visit을 없애봄 -> stack overflow 발생
  //3. BFS로 해결하자 -> 해결
  private static int[][] map;
  private static Queue<int[]> queue;
  private static int[][] minFromStart;
  private static int col;
  private static int row;
  private static int[] xPoint = {0, 0, 1, -1};
  private static int[] yPoint = {1, -1, 0, 0};


  public static void main(String[] args) {
    enterInput();
    bfs(new int[]{0, 0});

    System.out.println(minFromStart[row - 1][col - 1]);
  }

  private static void bfs(int[] start) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(start);

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      for (int i = 0; i < 4; i++) {
        int y = current[0] + yPoint[i];
        int x = current[1] + xPoint[i];
        if (isOutOfMapBound(x, y)) {
          continue;
        }

        if (map[y][x] == 1
            && minFromStart[y][x] > minFromStart[current[0]][current[1]] + map[y][x]) {
          minFromStart[y][x] = minFromStart[current[0]][current[1]] + map[y][x];
          queue.add(new int[]{y, x});
        }
      }
    }
  }

  private static boolean isOutOfMapBound(int x, int y) {
    return (y < 0 || y >= row) || (x < 0 || x >= col);
  }

  private static void enterInput() {
    Scanner scanner = new Scanner(System.in);
    row = scanner.nextInt();
    col = scanner.nextInt();

    map = new int[row][col];
    for (int i = 0; i < row; i++) {
      map[i] = Arrays.stream(scanner.next().split(""))
          .mapToInt(Integer::parseInt)
          .toArray();
    }

    minFromStart = new int[row][col];
    for (int i = 0; i < row; i++) {
      Arrays.fill(minFromStart[i], Integer.MAX_VALUE);
    }
    minFromStart[0][0] = 1;
  }
}
