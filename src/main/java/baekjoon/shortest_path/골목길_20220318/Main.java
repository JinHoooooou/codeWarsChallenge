package baekjoon.shortest_path.골목길_20220318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static StringTokenizer tokenizer;

  private static int vertexCount;
  private static int edgeCount;
  private static int[][] edges;
  private static int[] distanceFromSource;
  private static int[] predecessor;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    init();
    bellmanFord();

    if (distanceFromSource[vertexCount] == Integer.MIN_VALUE) {
      System.out.println(-1);
      return;
    }

    for (int[] edge : edges) {
      int from = edge[0];
      int to = edge[1];
      int weight = edge[2];
      if (distanceFromSource[from] == Integer.MIN_VALUE) {
        continue;
      }

      if (isCycle(from, to, weight) && isCycleOnPath(to)) {
        System.out.println(-1);
        return;
      }
    }

    printShortestPath();
  }

  private static void init() throws IOException {
    edges = new int[edgeCount][];
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges[i] = new int[]{from, to, weight};
    }

    distanceFromSource = new int[vertexCount + 1];
    predecessor = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      distanceFromSource[i] = Integer.MIN_VALUE;
      predecessor[i] = -1;
    }
    distanceFromSource[1] = 0;
  }

  private static void bellmanFord() {
    for (int i = 0; i < vertexCount - 1; i++) {
      for (int[] edge : edges) {
        int from = edge[0];
        int to = edge[1];
        int weight = edge[2];
        if (distanceFromSource[from] == Integer.MIN_VALUE) {
          continue;
        }
        if (distanceFromSource[to] < distanceFromSource[from] + weight) {
          distanceFromSource[to] = distanceFromSource[from] + weight;
          predecessor[to] = from;
        }
      }
    }
  }

  private static boolean isCycle(int from, int to, int weight) {
    return distanceFromSource[to] < distanceFromSource[from] + weight;
  }

  private static boolean isCycleOnPath(int targetVertex) {
    boolean[] visit = new boolean[vertexCount + 1];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(targetVertex);

    while (!queue.isEmpty()) {
      int currentVertex = queue.poll();
      if (visit[currentVertex]) {
        continue;
      }
      visit[currentVertex] = true;

      for (int[] edge : edges) {
        int from = edge[0];
        int to = edge[1];

        if (from == currentVertex && !visit[to]) {
          queue.add(to);
        }
      }
    }

    return visit[vertexCount];
  }

  private static void printShortestPath() {
    StringBuilder sb = new StringBuilder();
    int index = vertexCount;
    sb.append(vertexCount);
    while (predecessor[index] != -1) {
      sb.insert(0, predecessor[index] + " ");
      index = predecessor[index];
    }
    System.out.print(sb.toString());
  }
}
