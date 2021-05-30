package baekjoon.최단경로.케빈베이컨의6단계법칙_1389_20210530;

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
  private static final int INF = 99999;

  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int[][][] distance = init(vertexCount, edgeCount);

    floyd(vertexCount, distance);

    int[] result = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      result[i] = Arrays.stream(distance[vertexCount][i]).sum();
    }

    int minIndex = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= vertexCount; i++) {
      if (min > result[i]) {
        min = result[i];
        minIndex = i;
      }
    }

    WRITER.write(minIndex + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();

  }

  private static void floyd(int vertexCount, int[][][] distance) {
    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          distance[k][i][j] = Math.min(distance[k - 1][i][j],
              distance[k - 1][i][k] + distance[k - 1][k][j]);
        }
      }
    }
  }

  private static int[][][] init(int vertexCount, int edgeCount) throws IOException {
    int[][][] distance = new int[vertexCount + 1][vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      Arrays.fill(distance[0][i], 999999);
      distance[0][i][i] = 0;
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      distance[0][from][to] = 1;
      distance[0][to][from] = 1;
    }
    return distance;
  }
}
