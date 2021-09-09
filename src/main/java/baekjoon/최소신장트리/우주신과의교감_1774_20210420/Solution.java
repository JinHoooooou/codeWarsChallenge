package baekjoon.최소신장트리.우주신과의교감_1774_20210420;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static List<Edge> adjList;
  private static int[] parents;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    adjList = new ArrayList<>();
    parents = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      parents[i] = i;
    }
    int[][] points = new int[vertexCount + 1][2];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      points[i][0] = Integer.parseInt(tokenizer.nextToken());
      points[i][1] = Integer.parseInt(tokenizer.nextToken());
    }
    for (int i = 1; i <= vertexCount; i++) {
      int[] current = points[i];
      for (int j = i + 1; j <= vertexCount; j++) {
        int[] adj = points[j];
        double weight = Math
            .sqrt(Math.pow(current[0] - adj[0], 2) + Math.pow(current[1] - adj[1], 2));
        adjList.add(new Edge(i, j, weight));
      }
    }
    adjList.sort(Comparator.comparingDouble(o -> o.weight));
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      union(from, to);
    }

    double result = 0;
    for (int i = 0; i < adjList.size(); i++) {
      Edge current = adjList.get(i);
      int from = current.from;
      int to = current.to;
      double weight = current.weight;
      if (find(from) != find(to)) {
        result += weight;
        union(from, to);
      }
    }

    WRITER.write(String.format("%.2f", result));

    READER.close();
    WRITER.close();
  }

  private static void union(int x, int y) {
    x = find(x);
    y = find(y);

    if (x == y) {
      return;
    }
    parents[y] = x;
  }

  private static int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }
}

class Edge {

  int from;
  int to;
  double weight;

  public Edge(int from, int to, double weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }
}