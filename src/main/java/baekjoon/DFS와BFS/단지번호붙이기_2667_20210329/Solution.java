package baekjoon.DFS와BFS.단지번호붙이기_2667_20210329;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Solution {

  private static int[][] map;
  private static boolean[][] visit;

  public static void main(String[] args) {
    enterInput();
    List<Integer> townsSize = getTown();

    System.out.println(townsSize.size());
    for (Integer townSize : townsSize) {
      System.out.println(townSize);
    }
  }

  private static void printAnswers(List<Integer> townsSize) {

  }

  private static void enterInput() {
    Scanner scanner = new Scanner(System.in);
    int mapSize = scanner.nextInt();
    map = new int[mapSize][mapSize];
    visit = new boolean[mapSize][mapSize];

    for (int i = 0; i < mapSize; i++) {
      String data = scanner.next();
      map[i] = Arrays.stream(data.split(""))
          .mapToInt(Integer::parseInt)
          .toArray();
    }
  }

  private static List<Integer> getTown() {
    List<Integer> townCounts = new ArrayList<>();
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        if (map[i][j] == 1 && !visit[i][j]) {
          townCounts.add(getTownSize(map, visit, i, j));
        }
      }
    }
    townCounts.sort(Comparator.naturalOrder());
    return townCounts;
  }

  private static Integer getTownSize(int[][] map, boolean[][] visit, int y, int x) {
    if (y < 0 || y >= map.length) {
      return 0;
    }
    if (x < 0 || x >= map.length) {
      return 0;
    }
    if (map[y][x] == 0 || visit[y][x]) {
      return 0;
    }

    visit[y][x] = true;
    return map[y][x]
        + getTownSize(map, visit, y, x - 1)
        + getTownSize(map, visit, y, x + 1)
        + getTownSize(map, visit, y + 1, x)
        + getTownSize(map, visit, y - 1, x);
  }
}
