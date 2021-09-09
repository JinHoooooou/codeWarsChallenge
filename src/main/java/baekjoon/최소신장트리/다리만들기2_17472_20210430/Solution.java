package baekjoon.최소신장트리.다리만들기2_17472_20210430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static StringTokenizer tokenizer;
  private static int[][] map;
  private static boolean[][] visit;
  private static List<Island> islands;
  private static int[] parent;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int y = Integer.parseInt(tokenizer.nextToken());
    int x = Integer.parseInt(tokenizer.nextToken());
    map = new int[y][x];
    visit = new boolean[y][x];

    for (int i = 0; i < y; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 0; j < x; j++) {
        map[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }

    islands = new ArrayList<>();
    int index = 0;
    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        if (!visit[i][j] && map[i][j] == 1) {
          islands.add(index, new Island(index));
          buildIsland(i, j, index);
          index++;
        }
      }
    }

    List<Edge> edges = new ArrayList<>();
    for (int i = 0; i < islands.size(); i++) {
      for (int j = i + 1; j < islands.size(); j++) {
        List<int[]> current = islands.get(i).points;
        List<int[]> target = islands.get(j).points;

        for (int k = 0; k < current.size(); k++) {
          for (int l = 0; l < target.size(); l++) {
            int[] pointA = current.get(k);
            int[] pointB = target.get(l);
            int bridgeLength = 0;

            if (isSameRow(pointA, pointB)) {
              bridgeLength = calculateLength(pointA, pointB);
            } else if (isSameCol(pointA, pointB)) {
              bridgeLength = calculateLength(pointA, pointB);
            }

            if (bridgeLength != 0) {
              edges.add(new Edge(i, j, bridgeLength));
            }
          }
        }

      }
    }
    parent = new int[islands.size()];
    for (int i = 0; i < parent.length; i++) {
      parent[i] = i;
    }

    edges.sort(Comparator.comparingInt(o -> o.weight));
    int minWeight = 0;
    for (int i = 0; i < edges.size(); i++) {
      Edge current = edges.get(i);
      int from = current.from;
      int to = current.to;
      int weight = current.weight;
      if (find(from) != find(to)) {
        minWeight += weight;
        union(from, to);
      }
    }

    for (int i = 0; i < parent.length; i++) {
      if (find(i) != 0) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(minWeight);
  }

  private static int calculateLength(int[] pointA, int[] pointB) {
    int aY = pointA[0];
    int aX = pointA[1];
    int bY = pointB[0];
    int bX = pointB[1];

    int length = 0;
    if (aY == bY) {
      for (int i = Math.min(aX, bX) + 1; i < Math.max(aX, bX); i++) {
        if (map[aY][i] != 0) {
          return 0;
        }
        length++;
      }
    } else {
      for (int i = Math.min(aY, bY) + 1; i < Math.max(aY, bY); i++) {
        if (map[i][aX] != 0) {
          return 0;
        }
        length++;
      }
    }
    return length == 1 ? 0 : length;
  }

  private static boolean isSameCol(int[] pointA, int[] pointB) {
    return pointA[1] == pointB[1];
  }

  private static boolean isSameRow(int[] pointA, int[] pointB) {
    return pointA[0] == pointB[0];
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from > to) {
      parent[from] = to;
    } else {
      parent[to] = from;
    }
  }

  private static int find(int x) {
    if (parent[x] == x) {
      return x;
    }
    return parent[x] = find(parent[x]);
  }

  private static void buildIsland(int y, int x, int index) {
    if (y < 0 || y >= map.length) {
      return;
    }
    if (x < 0 || x >= map[y].length) {
      return;
    }
    if (map[y][x] == 0) {
      return;
    }
    if (visit[y][x]) {
      return;
    }

    visit[y][x] = true;
    islands.get(index).size += 1;
    islands.get(index).points.add(new int[]{y, x});

    buildIsland(y + 1, x, index);
    buildIsland(y - 1, x, index);
    buildIsland(y, x + 1, index);
    buildIsland(y, x - 1, index);
  }
}

class Island {

  List<int[]> points;
  int index;
  int size;

  public Island(int index) {
    this.points = new ArrayList<>();
    this.index = index;
    this.size = 0;
  }
}

class Edge {

  int from;
  int to;
  int weight;

  public Edge(int from, int to, int weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }
}