package baekjoon.최단경로.파티_1238_20210526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int vertexCount;


  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    List<Edge>[] adjList = buildAdjList(edgeCount);

    int max = Integer.MIN_VALUE;
    for (int i = 1; i <= vertexCount; i++) {
      int distance = dijkstra(adjList, i, destination) + dijkstra(adjList, destination, i);
      max = Math.max(max, distance);
    }

    WRITER.write(max + "");
    WRITER.flush();
    WRITER.close();
    READER.close();

  }

  private static List<Edge>[] buildAdjList(int edgeCount) throws IOException {
    List<Edge>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
    }
    return adjList;
  }

  private static int dijkstra(List<Edge>[] adjList, int source, int destination) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(new Edge(source, 0));
    distance[source] = 0;

    while (!queue.isEmpty()) {
      Edge currentEdge = queue.poll();

      for (Edge adjEdge : adjList[currentEdge.to]) {
        if (distance[adjEdge.to] > distance[currentEdge.to] + adjEdge.weight) {
          distance[adjEdge.to] = distance[currentEdge.to] + adjEdge.weight;
          queue.add(new Edge(adjEdge.to, distance[adjEdge.to]));
        }
      }
    }

    return distance[destination];
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