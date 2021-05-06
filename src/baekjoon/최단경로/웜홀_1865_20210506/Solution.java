package baekjoon.최단경로.웜홀_1865_20210506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final int INF = 999999;
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static int wormholeCount;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int testCase = Integer.parseInt(tokenizer.nextToken());

    while (testCase-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      vertexCount = Integer.parseInt(tokenizer.nextToken());
      edgeCount = Integer.parseInt(tokenizer.nextToken());
      wormholeCount = Integer.parseInt(tokenizer.nextToken());

      List<int[]> edges = initEdges();
      System.out.println(bellmanFord(edges) ? "YES" : "NO");
    }
  }

  private static List<int[]> initEdges() throws IOException {
    List<int[]> edges = new ArrayList<>();
    for (int i = 0; i < edgeCount + wormholeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      if (i < edgeCount) {
        edges.add(new int[]{from, to, weight});
        edges.add(new int[]{to, from, weight});
      } else {
        edges.add(new int[]{from, to, weight * -1});
      }
    }
    return edges;
  }

  private static boolean bellmanFord(List<int[]> edges) {
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, INF);
    distance[1] = 0;

    for (int i = 0; i < vertexCount - 1; i++) {
      for (int j = 0; j < edges.size(); j++) {
        int[] current = edges.get(j);
        int from = current[0];
        int to = current[1];
        int weight = current[2];

        if (distance[to] > distance[from] + weight) {
          distance[to] = distance[from] + weight;
        }
      }
    }

    for (int j = 0; j < edges.size(); j++) {
      int[] current = edges.get(j);
      int from = current[0];
      int to = current[1];
      int weight = current[2];

      if (distance[to] > distance[from] + weight) {
        return true;
      }
    }
    return false;
  }
}