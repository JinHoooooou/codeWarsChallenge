package baekjoon.최단경로.세금_13907_20210608;

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
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int taxCount = Integer.parseInt(tokenizer.nextToken());

    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    List<int[]> edges = new ArrayList<>();
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new int[]{from, to, weight});
      edges.add(new int[]{to, from, weight});
    }

    List<Integer> tax = new ArrayList<>();
    for (int i = 0; i < taxCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      tax.add(Integer.parseInt(tokenizer.nextToken()));
    }

    StringBuilder result = new StringBuilder();
    int[][] distance = new int[vertexCount + 1][];
    for (int i = 1; i <= vertexCount; i++) {
      distance[i] = new int[]{Integer.MAX_VALUE};
    }
    distance[source] = new int[]{0, 0};
    for (int i = 0; i < tax.size(); i++) {
      int currentTex = tax.get(i);
      for (int j = 0; j <= vertexCount; j++) {
        for (int[] edge : edges) {
          int from = edge[0];
          int to = edge[1];
          int weight = edge[2];

          if (distance[from][0] == Integer.MAX_VALUE) {
            continue;
          }
          if (distance[to][0] > distance[from][0] + weight) {
            distance[to] = new int[]{distance[from][0] + weight, distance[to][1] + 1};
          }
        }
      }

      result.append(distance[destination] + "\n");
    }

    WRITER.write(result.toString());
    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
