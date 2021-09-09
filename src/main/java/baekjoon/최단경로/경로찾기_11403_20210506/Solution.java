package baekjoon.최단경로.경로찾기_11403_20210506;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int vertexCount;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());

    int[][] adjMatrix = initAdjMatrix();
    boolean[][][] paths = floydWarshall(adjMatrix);

    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = 1; j <= vertexCount; j++) {
        result.append(paths[vertexCount][i][j] ? 1 : 0).append(" ");
      }
      result.append("\n");
    }
    WRITER.write(result.toString());

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] initAdjMatrix() throws IOException {
    int[][] adjMatrix = new int[vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 1; j <= vertexCount; j++) {
        adjMatrix[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }
    return adjMatrix;
  }

  private static boolean[][][] floydWarshall(int[][] adjMatrix) {
    boolean[][][] paths = new boolean[vertexCount + 1][vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = 1; j <= vertexCount; j++) {
        paths[0][i][j] = adjMatrix[i][j] == 1;
      }
    }

    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          paths[k][i][j] = paths[k - 1][i][j] || (paths[k - 1][i][k] && paths[k - 1][k][j]);
        }
      }
    }
    return paths;
  }
}
