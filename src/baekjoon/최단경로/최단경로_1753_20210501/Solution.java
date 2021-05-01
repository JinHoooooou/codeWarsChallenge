package baekjoon.최단경로.최단경로_1753_20210501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final int INF = 99999;
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static int startVertex;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    tokenizer = new StringTokenizer(READER.readLine());
    startVertex = Integer.parseInt(tokenizer.nextToken());
    List<Edge>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    int[][] map = new int[vertexCount + 1][vertexCount + 1];
    List<Edge> edges = new ArrayList<>();

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(from, to, weight));
      edges.add(new Edge(from, to, weight));
      map[from][to] = weight;
    }

    dijkstra(adjList, startVertex);
    bellmanFord(edges, startVertex);
    floyd(map, startVertex);

  }

  private static void floyd(int[][] map, int startVertex) {
    int[][][] distance = new int[vertexCount + 1][vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = 1; j <= vertexCount; j++) {
        if (i == j) {
          distance[0][i][j] = 0;
        } else if (map[i][j] != 0) {
          distance[0][i][j] = map[i][j];
        } else {
          distance[0][i][j] = INF;
        }
      }
    }

    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          distance[k][i][j] = Math.min(distance[k - 1][i][j],
              distance[k - 1][i][k] + distance[k - 1][k][j]);
        }
      }
    }

    for (int i = 1; i <= vertexCount; i++) {
      System.out.println(distance[vertexCount][startVertex][i]
          >= INF ? "INF" : distance[vertexCount][startVertex][i]);
    }
  }

  private static void bellmanFord(List<Edge> edges, int startVertex) {
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[startVertex] = 0;

    for (int i = 0; i < vertexCount - 1; i++) {
      for (int j = 0; j < edges.size(); j++) {
        int from = edges.get(j).from;
        int to = edges.get(j).to;
        int weight = edges.get(j).weight;
        if (distance[from] == Integer.MAX_VALUE) {
          continue;
        }
        if (distance[to] > distance[from] + weight) {
          distance[to] = distance[from] + weight;
        }
      }
    }

    for (int i = 0; i < edges.size(); i++) {
      for (int j = 0; j < edges.size(); j++) {
        int from = edges.get(j).from;
        int to = edges.get(j).to;
        int weight = edges.get(j).weight;
        if (distance[from] == Integer.MAX_VALUE) {
          continue;
        }
        if (distance[to] > distance[from] + weight) {
          System.out.println("음수사이클 -> 최단경로 x");
          return;
        }
      }
    }

    for (int i = 1; i <= vertexCount; i++) {
      System.out.println(distance[i] == Integer.MAX_VALUE ? "INF" : distance[i]);
    }

  }

  private static void dijkstra(List<Edge>[] adjList, int startVertex) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    int[] distance = new int[vertexCount + 1];
    boolean[] visit = new boolean[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);

    distance[startVertex] = 0;
    queue.add(new Edge(startVertex, startVertex, 0));

    while (!queue.isEmpty()) {
      Edge currentEdge = queue.poll();
      if (visit[currentEdge.to]) {
        continue;
      }
      visit[currentEdge.to] = true;
      for (Edge adjEdge : adjList[currentEdge.to]) {
        if (distance[adjEdge.to] > distance[adjEdge.from] + adjEdge.weight) {
          distance[adjEdge.to] = distance[adjEdge.from] + adjEdge.weight;
          queue.add(new Edge(adjEdge.from, adjEdge.to, distance[adjEdge.to]));
        }
      }
    }

    for (int i = 1; i <= vertexCount; i++) {
      System.out.println(distance[i] == Integer.MAX_VALUE ? "INF" : distance[i]);
    }
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