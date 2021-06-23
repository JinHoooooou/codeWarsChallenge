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

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int taxCount = Integer.parseInt(tokenizer.nextToken());

    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

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

    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
    int[][] distance = new int[vertexCount][vertexCount + 1];
    for (int i = 0; i < vertexCount; i++) {
      Arrays.fill(distance[i], INF);
    }
    queue.add(new int[]{source, 0, 0});
    for (int i = 0; i < vertexCount; i++) {
      distance[i][source] = 0;
    }

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int vertex = current[0];
      int stopOver = current[2];

      if (distance[stopOver][vertex] == INF) {
        continue;
      }
      if (stopOver == vertexCount - 1) {
        continue;
      }

      for (int[] adjEdge : edges[vertex]) {
        int to = adjEdge[0];
        int weight = adjEdge[1];

        int min = INF;
        for (int i = 0; i < vertexCount; i++) {
          min = Math.min(min, distance[i][to]);
        }

        if (min > distance[stopOver][vertex] + weight) {
          distance[stopOver + 1][to] = distance[stopOver][vertex] + weight;
          queue.add(new int[]{to, distance[stopOver + 1][to], stopOver + 1});
        } else {
          distance[stopOver + 1][to] = min;
        }
      }
    }

    int min = INF;
    for (int i = 0; i < vertexCount; i++) {
      min = Math.min(min, distance[i][destination]);
    }
    WRITER.write(min + "\n");

    while (taxCount-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int tax = Integer.parseInt(tokenizer.nextToken());
      min = distance[0][destination];

      for (int i = 0; i < vertexCount; i++) {
        distance[i][destination] += (i * tax);
        min = Math.min(min, distance[i][destination]);
      }
      WRITER.write(min + "\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
