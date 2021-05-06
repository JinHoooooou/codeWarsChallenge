package baekjoon.최단경로.최소비용구하기_1916_20210506;

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
  private static final int INF = 999999;
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;


  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    tokenizer = new StringTokenizer(READER.readLine());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    List<Edge>[] adjList = new List[vertexCount + 1];
    List<int[]> edges = new ArrayList<>();
    int[][] adjMatrix = new int[vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
      edges.add(new int[]{from, to, weight});
      adjMatrix[from][to] = weight;
    }
    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    //dijkstra(adjList, source, destination);
    //bellmanFord(edges, source, destination);
    floydWarshall(adjMatrix, source, destination);
  }

  private static void floydWarshall(int[][] adjMatrix, int source, int destination) {
    int[][][] distance = new int[vertexCount + 1][vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = 1; j <= vertexCount; j++) {
        if (i == j) {
          distance[0][i][j] = 1;
        } else if (adjMatrix[i][j] != 0) {
          distance[0][i][j] = adjMatrix[i][j];
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

    System.out.println(distance[vertexCount][source][destination]);
  }

  private static void bellmanFord(List<int[]> edges, int source, int destination) {
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[source] = 0;

    for (int i = 0; i < vertexCount - 1; i++) {
      for (int j = 0; j < edges.size(); j++) {
        int[] current = edges.get(j);
        int from = current[0];
        int to = current[1];
        int weight = current[2];

        if (distance[from] == Integer.MAX_VALUE) {
          continue;
        }
        if (distance[to] > distance[from] + weight) {
          distance[to] = distance[from] + weight;
        }
      }
    }

    for (int j = 0; j < edges.size(); j++) {
      int[] current = edges.get(j);
      int from = current[0];
      int to = current[1];
      int weight = current[2];

      if (distance[from] == Integer.MAX_VALUE) {
        continue;
      }
      if (distance[to] > distance[from] + weight) {
        System.out.println("음수사이클이라 최단경로가없음");
        return;
      }
    }

    System.out.println(distance[destination]);
  }

  private static void dijkstra(List<Edge>[] adjList,
      int source, int destination) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    int[] distance = new int[vertexCount + 1];
    boolean[] visit = new boolean[vertexCount + 1];

    Arrays.fill(distance, Integer.MAX_VALUE);
    queue.add(new Edge(source, 0));
    distance[source] = 0;

    while (!queue.isEmpty()) {
      Edge current = queue.poll();
      if (visit[current.to]) {
        continue;
      }
      visit[current.to] = true;
      for (Edge adjEdge : adjList[current.to]) {
        if (distance[adjEdge.to] > distance[current.to] + adjEdge.weight) {
          distance[adjEdge.to] = distance[current.to] + adjEdge.weight;
          queue.add(new Edge(adjEdge.to, distance[adjEdge.to]));
        }
      }
    }
    System.out.println(distance[destination]);
  }
}

class Edge {

  int to;
  int weight;

  public Edge(int to, int weight) {
    this.to = to;
    this.weight = weight;
  }
}