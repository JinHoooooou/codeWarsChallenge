package baekjoon.최단경로.미확인도착지_9370_20210421;

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
  private static List<Edge>[] adjList;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int testCount = Integer.parseInt(tokenizer.nextToken());
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < testCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      vertexCount = Integer.parseInt(tokenizer.nextToken());
      int edgeCount = Integer.parseInt(tokenizer.nextToken());
      int destinationCandidateCount = Integer.parseInt(tokenizer.nextToken());

      tokenizer = new StringTokenizer(READER.readLine());
      int source = Integer.parseInt(tokenizer.nextToken());
      int stopOver1 = Integer.parseInt(tokenizer.nextToken());
      int stopOver2 = Integer.parseInt(tokenizer.nextToken());

      adjList = buildAdjList(edgeCount);
      int[] candidates = buildCandidates(destinationCandidateCount);

      PriorityQueue<Integer> resultQueue = new PriorityQueue<>();
      for (int destination : candidates) {
        int course1 = dijkstra(source, stopOver1)
            + dijkstra(stopOver1, stopOver2) + dijkstra(stopOver2, destination);
        int course2 = dijkstra(source, stopOver2)
            + dijkstra(stopOver2, stopOver1) + dijkstra(stopOver1, destination);
        int minPath = dijkstra(source, destination);

        if (Math.min(course1, course2) == minPath) {
          resultQueue.add(destination);
        }
      }

      while (!resultQueue.isEmpty()) {
        result.append(resultQueue.poll() + " ");
      }
      result.append("\n");
    }

    WRITER.write(result.toString());
    READER.close();
    WRITER.close();
  }

  private static int dijkstra(int source, int destination) {
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    int[] distance = new int[vertexCount + 1];
    boolean[] visit = new boolean[vertexCount + 1];

    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[source] = 0;
    queue.add(new Edge(source, 0));

    while (!queue.isEmpty()) {
      Edge current = queue.poll();
      int to = current.to;

      if (visit[to]) {
        continue;
      }
      visit[to] = true;

      for (Edge adjEdge : adjList[to]) {
        if (distance[adjEdge.to] > distance[to] + adjEdge.weight) {
          distance[adjEdge.to] = distance[to] + adjEdge.weight;
          queue.add(new Edge(adjEdge.to, distance[adjEdge.to]));
        }
      }
    }

    return distance[destination];
  }

  private static int[] buildCandidates(int destinationCandidateCount) throws IOException {
    int[] candidates = new int[destinationCandidateCount];
    for (int j = 0; j < destinationCandidateCount; j++) {
      tokenizer = new StringTokenizer(READER.readLine());
      candidates[j] = Integer.parseInt(tokenizer.nextToken());
    }
    return candidates;
  }

  private static List<Edge>[] buildAdjList(int edgeCount) throws IOException {
    List<Edge>[] adjList = new List[vertexCount + 1];
    for (int j = 1; j <= vertexCount; j++) {
      adjList[j] = new ArrayList<>();
    }
    for (int j = 1; j <= edgeCount; j++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
      adjList[to].add(new Edge(from, weight));
    }
    return adjList;
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