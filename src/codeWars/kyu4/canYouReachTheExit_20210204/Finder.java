package codeWars.kyu4.canYouReachTheExit_20210204;

public class Finder {

  public static boolean pathFinder(String maze) {
    String[] map = maze.split("\n");
    boolean[][] visit = new boolean[map.length][map.length];

    search(map, visit, 0, 0);

    return visit[visit.length - 1][visit.length - 1];
  }

  private static void search(String[] map, boolean[][] visit, int y, int x) {
    if (y < 0 || y >= visit.length) {
      return;
    }
    if (x < 0 || x >= visit.length) {
      return;
    }
    if (visit[y][x] || map[y].charAt(x) == 'W') {
      return;
    }

    visit[y][x] = true;
    search(map, visit, y, x + 1);
    search(map, visit, y, x - 1);
    search(map, visit, y + 1, x);
    search(map, visit, y - 1, x);

  }

  private static boolean[][] init(String maze) {
    String[] map = maze.split("\n");
    boolean[][] visit = new boolean[map.length][map.length];

    for (int i = 0; i < visit.length; i++) {
      for (int j = 0; j < visit.length; j++) {
        visit[i][j] = map[i].charAt(j) == '.';
      }
    }

    return visit;
  }
}
