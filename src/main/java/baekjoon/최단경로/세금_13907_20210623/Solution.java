package baekjoon.최단경로.세금_13907_20210623;

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
  private static final int INF = Integer.MAX_VALUE - 1000000;
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    int taxCount = Integer.parseInt(tokenizer.nextToken());

    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    List<int[]>[] edges = buildEdges();
    long[][] distance = dijkstra(edges, source, destination);

    int tax = 0;
    while (taxCount-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      tax += Integer.parseInt(tokenizer.nextToken());
      long min = INF;

      for (int i = 0; i < vertexCount; i++) {
        min = Math.min(min, distance[i][destination] + (i * tax));
      }
      WRITER.write(min + "\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static List<int[]>[] buildEdges() throws IOException {
    List<int[]>[] edges = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      edges[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges[from].add(new int[]{to, weight});
      edges[to].add(new int[]{from, weight});
    }
    return edges;
  }

  private static long[][] dijkstra(List<int[]>[] edges, int source, int destination)
      throws IOException {
    long[][] distance = new long[vertexCount][vertexCount + 1];
    PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparingLong(x -> x[1]));
    for (int i = 0; i < vertexCount; i++) {
      Arrays.fill(distance[i], INF);
    }
    queue.add(new long[]{source, 0, 0});
    distance[0][source] = 0;
    long min = INF;

    while (!queue.isEmpty()) {
      long[] current = queue.poll();
      int vertex = (int) current[0];
      long minDistance = current[1];
      int stopOver = (int) current[2];

      boolean check = false;
      for (int i = 0; i < stopOver; i++) {
        if (distance[i][vertex] < minDistance) {
          check = true;
          break;
        }
      }

      if (check || distance[stopOver][vertex] < minDistance) {
        continue;
      }
      if (vertex == destination) {
        min = Math.min(min, distance[stopOver][vertex]);
      }

      for (int[] adjEdge : edges[vertex]) {
        int to = adjEdge[0];
        int weight = adjEdge[1];

        if (stopOver + 1 < vertexCount
            && distance[stopOver + 1][to] > distance[stopOver][vertex] + weight) {
          distance[stopOver + 1][to] = distance[stopOver][vertex] + weight;
          queue.add(new long[]{to, distance[stopOver + 1][to], stopOver + 1});
        }
      }
    }

    WRITER.write(min + "\n");
    return distance;
  }
}
