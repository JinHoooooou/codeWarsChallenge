package baekjoon.최소신장트리.네트워크연결_1922_20210505;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static int[] parents;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    tokenizer = new StringTokenizer(READER.readLine());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    List<Edge>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    PriorityQueue<int[]> edges = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new int[]{from, to, weight});
      adjList[from].add(new Edge(to, weight));
      adjList[to].add(new Edge(from, weight));
    }

    kruskal(edges);
    prim(adjList);
  }

  private static void prim(List<Edge>[] adjList) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(new Edge(1, 0));

    int minWeight = 0;
    while (!queue.isEmpty()) {
      Edge current = queue.poll();
      if (visit[current.to]) {
        continue;
      }
      visit[current.to] = true;
      minWeight += current.weight;
      for (Edge adjEdge : adjList[current.to]) {
        queue.add(adjEdge);
      }
    }
    System.out.println(minWeight);
  }

  private static void kruskal(PriorityQueue<int[]> edges) {
    parents = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      parents[i] = i;
    }

    int minWeight = 0;
    while (!edges.isEmpty()) {
      int[] current = edges.poll();
      int from = current[0];
      int to = current[1];
      int weight = current[2];

      if (find(from) != find(to)) {
        minWeight += weight;
        union(from, to);
      }
    }
    System.out.println(minWeight);
  }

  private static int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from > to) {
      parents[from] = to;
    } else {
      parents[to] = from;
    }
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