package baekjoon.최단경로.최단경로_1753_20210413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER =
      new BufferedWriter(new OutputStreamWriter(System.out));
  private static int vertexCount;
  private static int edgeCount;
  private static int startVertex;
  private static List<Edge>[] adjList;
  private static int[] distance;

  public static void main(String[] args) throws IOException {
    StringTokenizer stringTokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(stringTokenizer.nextToken());
    edgeCount = Integer.parseInt(stringTokenizer.nextToken());
    startVertex = Integer.parseInt(READER.readLine());

    adjList = new List[vertexCount + 1];
    distance = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    Arrays.fill(distance, Integer.MAX_VALUE);

    for (int i = 0; i < edgeCount; i++) {
      stringTokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(stringTokenizer.nextToken());
      int to = Integer.parseInt(stringTokenizer.nextToken());
      int weight = Integer.parseInt(stringTokenizer.nextToken());

      adjList[from].add(new Edge(from, to, weight));
    }

    dijkstra(startVertex);

    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= vertexCount; i++) {
      if (distance[i] == Integer.MAX_VALUE) {
        result.append("INF\n");
      } else {
        result.append(distance[i] + "\n");
      }
    }

    WRITER.write(result.toString());
    WRITER.close();
    READER.close();
  }

  private static void dijkstra(int startVertex) {
    PriorityQueue<Edge> queue = new PriorityQueue<>();
    boolean[] visit = new boolean[vertexCount + 1];
    distance[startVertex] = 0;
    queue.add(new Edge(startVertex, startVertex, 0));

    while (!queue.isEmpty()) {
      Edge minEdge = queue.poll();

      for (Edge adjEdge : adjList[minEdge.to]) {
        if (distance[adjEdge.to] > distance[minEdge.to] + adjEdge.weight) {
          distance[adjEdge.to] = distance[minEdge.to] + adjEdge.weight;
          queue.add(new Edge(adjEdge.from, adjEdge.to, distance[adjEdge.to]));
        }
      }
    }
  }
}

class Edge implements Comparable<Edge> {

  public int from;
  public int to;
  public int weight;

  public Edge(int from, int to, int weight) {
    this.from = from;
    this.to = to;
    this.weight = weight;
  }

  @Override
  public int compareTo(Edge o) {
    return this.weight - o.weight;
  }
}