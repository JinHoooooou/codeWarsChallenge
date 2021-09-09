package baekjoon.최단경로.오민식의고민_1219_20210519;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());

    List<Edge> edges = buildEdges(edgeCount);
    bellmanFord(edges, vertexCount, source, destination);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void bellmanFord(List<Edge> edges, int vertexCount, int source, int destination)
      throws IOException {
    long[] distance = new long[vertexCount];
    Arrays.fill(distance, Integer.MIN_VALUE);

    long[] costs = new long[vertexCount];
    tokenizer = new StringTokenizer(READER.readLine());
    for (int i = 0; i < vertexCount; i++) {
      costs[i] = Integer.parseInt(tokenizer.nextToken());
    }

    distance[source] = costs[source];

    for (int i = 0; i <= vertexCount + 100; i++) {
      for (Edge edge : edges) {
        int from = edge.from;
        int to = edge.to;
        int weight = edge.weight;

        if (distance[from] == Integer.MIN_VALUE) {
          continue;
        } else if (distance[from] == Long.MAX_VALUE) {
          distance[to] = Long.MAX_VALUE;
        } else if (distance[to] < distance[from] + weight + costs[to]) {
          distance[to] = distance[from] + weight + costs[to];

          if (i >= vertexCount - 1) {
            distance[to] = Long.MAX_VALUE;
          }
        }
      }
    }
    StringBuilder result = new StringBuilder();
    if (distance[destination] == Integer.MIN_VALUE) {
      result.append("gg");
    } else if (distance[destination] == Long.MAX_VALUE) {
      result.append("Gee");
    } else {
      result.append(distance[destination]);
    }

    WRITER.write(result.toString());

  }

  private static List<Edge> buildEdges(int edgeCount) throws IOException {

    List<Edge> edges = new ArrayList<>();

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new Edge(from, to, weight * -1));
    }
    return edges;
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