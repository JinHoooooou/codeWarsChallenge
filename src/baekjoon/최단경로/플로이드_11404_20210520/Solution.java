package baekjoon.최단경로.플로이드_11404_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static final int INF = 99999999;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    tokenizer = new StringTokenizer(READER.readLine());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());

    int[][] distance = init(vertexCount, edgeCount);
    floyd(distance, vertexCount);
    print(distance, vertexCount);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void print(int[][] distance, int vertexCount) throws IOException {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = 1; j <= vertexCount; j++) {
        result.append(distance[i][j] >= INF ? "0 " : distance[i][j] + " ");
      }
      result.append("\n");
    }
    WRITER.write(result.toString());
  }

  private static void floyd(int[][] distance, int vertexCount) {
    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
        }
      }
    }
  }

  private static int[][] init(int vertexCount, int edgeCount) throws IOException {
    int[][] distance = new int[vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      Arrays.fill(distance[i], INF);
      distance[i][i] = 0;
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      distance[from][to] = Math.min(weight, distance[from][to]);
    }
    return distance;
  }

}
