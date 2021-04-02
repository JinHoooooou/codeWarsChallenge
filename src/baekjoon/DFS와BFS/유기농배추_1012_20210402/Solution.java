package baekjoon.DFS와BFS.유기농배추_1012_20210402;

import java.util.Scanner;

public class Solution {

  static Test[] tests;

  public static void solution() {
    enterInput();

    for (int i = 0; i < tests.length; i++) {
      for (int y = 0; y < tests[i].row; y++) {
        for (int x = 0; x < tests[i].col; x++) {
          if (tests[i].cabbageMap[y][x] == 1 && !tests[i].visit[y][x]) {
            dfs(tests[i], y, x);
            tests[i].bugCount += 1;
          }
        }
      }
    }

    for (Test test : tests) {
      System.out.println(test.bugCount);
    }
  }

  private static void enterInput() {
    Scanner scanner = new Scanner(System.in);
    tests = new Test[scanner.nextInt()];

    for (int i = 0; i < tests.length; i++) {
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      int cabbageCount = scanner.nextInt();
      int[][] cabbageMap = new int[row][col];
      boolean[][] visit = new boolean[row][col];
      int bugCount = 0;

      for (int j = 0; j < cabbageCount; j++) {
        cabbageMap[scanner.nextInt()][scanner.nextInt()] = 1;
      }
      tests[i] = new Test(row, col, cabbageMap, visit, bugCount);
    }
  }

  private static void dfs(Test test, int y, int x) {
    if (y < 0 || y >= test.row) {
      return;
    }
    if (x < 0 || x >= test.col) {
      return;
    }
    if (test.visit[y][x] || test.cabbageMap[y][x] == 0) {
      return;
    }

    test.visit[y][x] = true;
    dfs(test, y, x + 1);
    dfs(test, y, x - 1);
    dfs(test, y + 1, x);
    dfs(test, y - 1, x);
  }
}

class Test {

  int row;
  int col;
  int[][] cabbageMap;
  boolean[][] visit;
  int bugCount;

  public Test(int row, int col, int[][] cabbageMap, boolean[][] visit, int bugCount) {
    this.row = row;
    this.col = col;
    this.cabbageMap = cabbageMap;
    this.visit = visit;
    this.bugCount = bugCount;
  }
}