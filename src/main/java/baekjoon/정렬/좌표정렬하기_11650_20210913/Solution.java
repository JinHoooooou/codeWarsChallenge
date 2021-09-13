package baekjoon.정렬.좌표정렬하기_11650_20210913;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    int[][] matrix = new int[length][2];
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      matrix[i][0] = Integer.parseInt(tokenizer.nextToken());
      matrix[i][1] = Integer.parseInt(tokenizer.nextToken());
    }

    Arrays.sort(matrix, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);

    for (int i = 0; i < length; i++) {
      WRITER.write(matrix[i][0] + " " + matrix[i][1] + "\n");
    }

    WRITER.flush();
    READER.close();
    WRITER.close();
  }
}
