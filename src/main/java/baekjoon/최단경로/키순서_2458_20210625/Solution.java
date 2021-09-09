package baekjoon.최단경로.키순서_2458_20210625;

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
  private static final int INF = 987654321;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int[][] distance = buildAdjMatrix(vertexCount, edgeCount);

    floyd(vertexCount, distance);

    int result = 0;
    for (int i = 1; i <= vertexCount; i++) {
      int outgoing = 0;
      int incoming = 0;

      for (int j = 1; j <= vertexCount; j++) {
        if (distance[i][j] > 0 && distance[i][j] < INF) {
          outgoing++;
        }
        if (distance[j][i] > 0 && distance[j][i] < INF) {
          incoming++;
        }
      }
      if (outgoing + incoming == vertexCount - 1) {
        result++;
      }
    }
    WRITER.write(result + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void floyd(int vertexCount, int[][] distance) {
    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
        }
      }
    }
  }

  private static int[][] buildAdjMatrix(int vertexCount, int edgeCount) throws IOException {
    int[][] distance = new int[vertexCount + 1][vertexCount + 1];

    for (int i = 1; i <= vertexCount; i++) {
      Arrays.fill(distance[i], INF);
      distance[i][i] = 0;
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());

      distance[from][to] = 1;
    }
    return distance;
  }
}
