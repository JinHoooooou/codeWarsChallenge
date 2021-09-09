package baekjoon.최단경로.할로윈묘지_3860_20210527;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static final int GRAVE = 1;
  private static final int HOLE = 2;

  private static StringTokenizer tokenizer;
  private static int row;
  private static int col;

  public static void main(String[] args) throws IOException {
    while (true) {
      tokenizer = new StringTokenizer(READER.readLine());
      col = Integer.parseInt(tokenizer.nextToken());
      row = Integer.parseInt(tokenizer.nextToken());
      if (col == 0 && row == 0) {
        break;
      }
      int[][] map = buildMap();
      List<Edge> edges = buildEdges(map);

      bellmanFord(edges);
    }
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void bellmanFord(List<Edge> edges) throws IOException {
    long[][] distance = new long[row][col];
    for (int i = 0; i < row; i++) {
      Arrays.fill(distance[i], Long.MAX_VALUE);
    }
    distance[0][0] = 0;
    boolean update = false;

    for (int i = 0; i < row * col; i++) {
      for (Edge edge : edges) {
        int[] from = edge.from;
        int[] to = edge.to;

        if (distance[from[0]][from[1]] == Long.MAX_VALUE) {
          continue;
        }

        if (distance[to[0]][to[1]] > distance[from[0]][from[1]] + edge.weight) {
          distance[to[0]][to[1]] = distance[from[0]][from[1]] + edge.weight;
          update = true;
        }

        if (!update) {
          break;
        }
      }
    }

    if (update) {
      for (Edge edge : edges) {
        int[] from = edge.from;
        int[] to = edge.to;

        if (distance[from[0]][from[1]] == Long.MAX_VALUE) {
          continue;
        }

        if (distance[to[0]][to[1]] > distance[from[0]][from[1]] + edge.weight) {
          WRITER.write("Never" + "\n");
          return;
        }
      }
    }

    if (distance[row - 1][col - 1] == Long.MAX_VALUE) {
      WRITER.write("Impossible" + "\n");
    } else {
      WRITER.write(distance[row - 1][col - 1] + "\n");
    }


  }

  private static int[][] buildMap() throws IOException {
    int[][] map = new int[row][col];

    tokenizer = new StringTokenizer(READER.readLine());
    int graveCount = Integer.parseInt(tokenizer.nextToken());
    for (int i = 0; i < graveCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int x = Integer.parseInt(tokenizer.nextToken());
      int y = Integer.parseInt(tokenizer.nextToken());
      map[y][x] = GRAVE;
    }
    return map;
  }

  private static List<Edge> buildEdges(int[][] map) throws IOException {
    List<Edge> edges = new ArrayList<>();
    int[] yPoint = {1, -1, 0, 0};
    int[] xPoint = {0, 0, 1, -1};

    tokenizer = new StringTokenizer(READER.readLine());
    int holeCount = Integer.parseInt(tokenizer.nextToken());
    for (int i = 0; i < holeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int x1 = Integer.parseInt(tokenizer.nextToken());
      int y1 = Integer.parseInt(tokenizer.nextToken());
      int x2 = Integer.parseInt(tokenizer.nextToken());
      int y2 = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      map[y1][x1] = HOLE;
      edges.add(new Edge(new int[]{y1, x1}, new int[]{y2, x2}, weight));
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == row - 1 && j == col - 1) {
          continue;
        }
        if (map[i][j] != 0) {
          continue;
        }

        for (int k = 0; k < 4; k++) {
          int y = i + yPoint[k];
          int x = j + xPoint[k];

          if (y < 0 || y >= row) {
            continue;
          }
          if (x < 0 || x >= col) {
            continue;
          }
          if (map[y][x] != GRAVE) {
            edges.add(new Edge(new int[]{i, j}, new int[]{y, x}, 1));
          }
        }

      }
    }

    return edges;
  }
}

class Edge {

  int[] from;
  int[] to;
  int weight;

  public Edge(int[] from, int[] to, int weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }
}