package baekjoon.누적합.이차원배의합_2167_20210616;

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

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int row = Integer.parseInt(tokenizer.nextToken());
    int col = Integer.parseInt(tokenizer.nextToken());
    int[][] areaSums = new int[row + 1][col + 1];
    for (int i = 1; i <= row; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 1; j <= col; j++) {
        areaSums[i][j] = Integer.parseInt(tokenizer.nextToken())
            + areaSums[i][j - 1] + areaSums[i - 1][j] - areaSums[i - 1][j - 1];
      }
    }

    int count = Integer.parseInt(READER.readLine());
    while (count-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int startY = Integer.parseInt(tokenizer.nextToken());
      int startX = Integer.parseInt(tokenizer.nextToken());
      int endY = Integer.parseInt(tokenizer.nextToken());
      int endX = Integer.parseInt(tokenizer.nextToken());

      int result = areaSums[endY][endX]
          - (areaSums[endY][startX - 1]
          + areaSums[startY - 1][endX] - areaSums[startY - 1][startX - 1]);

      WRITER.write(result + "\n");
    }
    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
