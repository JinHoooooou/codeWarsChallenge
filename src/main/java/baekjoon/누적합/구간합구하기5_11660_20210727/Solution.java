package baekjoon.누적합.구간합구하기5_11660_20210727;

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

  private static int[][] initMap(int length) throws IOException {
    int[][] map = new int[length + 1][length + 1];
    for (int i = 1; i <= length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 1; j <= length; j++) {
        map[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }
    return map;
  }

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    int calCount = Integer.parseInt(tokenizer.nextToken());

    int[][] map = initMap(length);
    int[][] prefixSums = initPrefixSums(length, map);

    calculate(calCount, prefixSums);
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] initPrefixSums(int length, int[][] map) {
    int[][] prefixSums = new int[length + 1][length + 1];
    for (int i = 1; i <= length; i++) {
      for (int j = 1; j <= length; j++) {
        int left = prefixSums[i][j - 1];
        int up = prefixSums[i - 1][j];
        int diagonal = prefixSums[i - 1][j - 1];
        prefixSums[i][j] = left + up - diagonal + map[i][j];
      }
    }
    return prefixSums;
  }

  private static void calculate(int calCount, int[][] prefixSums) throws IOException {
    for (int i = 0; i < calCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int startY = Integer.parseInt(tokenizer.nextToken());
      int startX = Integer.parseInt(tokenizer.nextToken());
      int endY = Integer.parseInt(tokenizer.nextToken());
      int endX = Integer.parseInt(tokenizer.nextToken());
      WRITER.write(
          prefixSums[endY][endX] - prefixSums[startY - 1][endX] - prefixSums[endY][startX - 1]
              + prefixSums[startY - 1][startX - 1] + "\n");
    }
  }
}
