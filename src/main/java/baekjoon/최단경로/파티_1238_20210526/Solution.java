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
  private static int edgeCount;


  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    List<Edge>[] adjList = new List[vertexCount + 1];
    List<Edge>[] reverseAdjList = new List[vertexCount + 1];

    buildAdjList(adjList, reverseAdjList);

    int max = Integer.MIN_VALUE;
    int[] go_distance = dijkstra(reverseAdjList, destination);
    int[] back_distance = dijkstra(adjList, destination);

    for (int i = 1; i <= vertexCount; i++) {
      max = Math.max(max, go_distance[i] + back_distance[i]);
    }

    WRITER.write(max + "");
    WRITER.flush();
    WRITER.close();
    READER.close();

  }

  private static void buildAdjList(List<Edge>[] adjList, List<Edge>[] reverseAdjList)
      throws IOException {
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
      reverseAdjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
      reverseAdjList[to].add(new Edge(from, weight));
    }
  }

  private static int[] dijkstra(List<Edge>[] adjList, int source) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, Integer.MAX_VALUE);
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

    return distance;
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