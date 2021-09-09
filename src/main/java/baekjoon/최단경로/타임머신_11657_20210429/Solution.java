package baekjoon.최단경로.타임머신_11657_20210429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    List<int[]> edges = buildEdges(edgeCount);

    long[] distance = bellmanFord(edges, vertexCount, edgeCount);
    for (int i = 2; i < distance.length; i++) {
      System.out.println(distance[i] == Long.MAX_VALUE ? -1 : distance[i]);
    }
  }

  private static long[] bellmanFord(List<int[]> edges, int vertexCount, int edgeCount) {
    long[] distance = new long[vertexCount + 1];
    Arrays.fill(distance, Long.MAX_VALUE);
    distance[1] = 0;

    for (int i = 0; i < vertexCount - 1; i++) {
      for (int j = 0; j < edgeCount; j++) {
        int[] currentEdge = edges.get(j);
        int from = currentEdge[0];
        int to = currentEdge[1];
        int weight = currentEdge[2];

        if (distance[from] == Long.MAX_VALUE) {
          continue;
        }
        if (distance[to] > distance[from] + weight) {
          distance[to] = distance[from] + weight;
        }
      }
    }

    if (isNegativeCycle(edges, distance, edgeCount)) {
      return new long[]{-1, -1, -1};
    }
    return distance;
  }

  private static boolean isNegativeCycle(List<int[]> edges, long[] distance, int edgeCount) {
    for (int j = 0; j < edgeCount; j++) {
      int[] currentEdge = edges.get(j);
      int from = currentEdge[0];
      int to = currentEdge[1];
      int weight = currentEdge[2];

      if (distance[from] == Long.MAX_VALUE) {
        continue;
      }
      if (distance[to] > distance[from] + weight) {
        return true;
      }
    }
    return false;

  }

  private static List<int[]> buildEdges(int edgeCount) throws IOException {
    List<int[]> edges = new ArrayList<>();

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new int[]{from, to, weight});
    }
    return edges;
  }
}
