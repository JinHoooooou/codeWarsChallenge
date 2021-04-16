package baekjoon.최단경로.특정한최단경로_1504_20210414;

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
  private static int vertexCount;
  private static int edgeCount;
  private static List<Edge>[] adjList;
  private static int[] stopover;

  public static void main(String[] args) throws IOException {
    enterInput();

    System.out.println(Math.min(stopOverDijkstra(stopover[0], stopover[1]),
        stopOverDijkstra(stopover[1], stopover[0])));
  }

  private static int stopOverDijkstra(int stop1, int stop2) {
    int a = dijkstra(1, stop1);
    int b = dijkstra(stop1, stop2);
    int c = dijkstra(stop2, vertexCount);
    if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE || c == Integer.MAX_VALUE) {
      return -1;
    }
    return a + b + c;
  }

  private static int dijkstra(int source, int destination) {
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    distance[source] = 0;
    queue.add(new Edge(source, 0));

    while (!queue.isEmpty()) {
      Edge minEdge = queue.poll();

      for (Edge adjEdge : adjList[minEdge.to]) {
        if (distance[adjEdge.to] > distance[minEdge.to] + adjEdge.weight) {
          distance[adjEdge.to] = distance[minEdge.to] + adjEdge.weight;
          queue.add(new Edge(adjEdge.to, distance[adjEdge.to]));
        }
      }
    }

    return distance[destination];
  }

  private static void enterInput() throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
      adjList[to].add(new Edge(from, weight));
    }
    tokenizer = new StringTokenizer(READER.readLine());
    stopover = new int[]{Integer.parseInt(tokenizer.nextToken()),
        Integer.parseInt(tokenizer.nextToken())};

    READER.close();
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