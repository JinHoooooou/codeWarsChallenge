package baekjoon.mst.복제로봇_20220120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

  private static BufferedReader reader;
  private static int[] pointY = {0, 0, 1, -1};
  private static int[] pointX = {1, -1, 0, 0};
  private static List<int[]> edges;
  private static Vertex[] vertices;
  private static int[] parents;

  public static void main(String[] args) throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
    edges = new ArrayList<>();

    String[] parts = reader.readLine().split(" ");
    int mapSize = Integer.parseInt(parts[0]);
    int vertexCount = Integer.parseInt(parts[1]) + 1;
    vertices = new Vertex[vertexCount];
    char[][] maps = buildMapsAndAddVertex(mapSize);

    for (Vertex vertex : vertices) {
      getEdgesUsingBFS(maps, vertex);
    }

    parents = makeSet();
    int result = kruskal();

    System.out.println(isMST() ? result : -1);
  }

  private static char[][] buildMapsAndAddVertex(int mapSize) throws IOException {
    char[][] maps = new char[mapSize][mapSize];
    int vertexIndex = 0;

    for (int i = 0; i < mapSize; i++) {
      String line = reader.readLine();
      for (int j = 0; j < mapSize; j++) {
        maps[i][j] = line.charAt(j);
        if (isSourceOrKey(maps[i][j])) {
          vertices[vertexIndex] = new Vertex(i, j, vertexIndex++);
        }
      }
    }
    return maps;
  }

  private static boolean isSourceOrKey(char c) {
    return c == 'S' || c == 'K';
  }

  private static void getEdgesUsingBFS(char[][] maps, Vertex sourceVertex) {
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] visit = new boolean[maps.length][maps.length];
    visit[sourceVertex.y][sourceVertex.x] = true;
    queue.add(new int[]{sourceVertex.y, sourceVertex.x, 0});

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int currentY = current[0];
      int currentX = current[1];
      int distanceFromSourceVertex = current[2];

      for (int i = 0; i < 4; i++) {
        int nextY = currentY + pointY[i];
        int nextX = currentX + pointX[i];

        if (!visit[nextY][nextX] && isValidPoint(maps, nextY, nextX)) {
          visit[nextY][nextX] = true;
          queue.add(new int[]{nextY, nextX, distanceFromSourceVertex + 1});

          if (isSourceOrKey(maps[nextY][nextX])) {
            for (Vertex destinationVertex : vertices) {
              if (destinationVertex.y == nextY && destinationVertex.x == nextX) {
                edges.add(
                    new int[]{sourceVertex.id, destinationVertex.id, distanceFromSourceVertex + 1});
                break;
              }
            }
          }
        }
      }
    }
  }

  private static boolean isValidPoint(char[][] maps, int nextY, int nextX) {
    return (nextY >= 0 && nextY < maps.length)
        && (nextX >= 0 && nextX < maps.length)
        && (maps[nextY][nextX] != '1');
  }

  private static int kruskal() {
    edges.sort(Comparator.comparingInt(x -> x[2]));
    int result = 0;
    for (int[] edge : edges) {
      int from = edge[0];
      int to = edge[1];
      int weight = edge[2];

      if (find(parents, from) != find(parents, to)) {
        union(parents, from, to);
        result += weight;
      }
    }
    return result;
  }

  private static int[] makeSet() {
    int[] parents = new int[vertices.length];
    for (int i = 0; i < parents.length; i++) {
      parents[i] = i;
    }
    return parents;
  }

  private static int find(int[] parents, int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents, parents[x]);
  }

  private static void union(int[] parents, int x, int y) {
    x = find(parents, x);
    y = find(parents, y);

    if (x == y) {
      return;
    }

    if (x < y) {
      parents[y] = x;
    } else {
      parents[x] = y;
    }
  }

  private static boolean isMST() {
    for (int i = 0; i < vertices.length; i++) {
      if (find(parents, i) != 0) {
        return false;
      }
    }
    return true;
  }

  private static class Vertex {

    int y;
    int x;
    int id;

    public Vertex(int y, int x, int id) {
      this.y = y;
      this.x = x;
      this.id = id;
    }
  }
}
