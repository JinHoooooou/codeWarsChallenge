package baekjoon.누적합.구간합구하기4_20210702;

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
    int length = Integer.parseInt(tokenizer.nextToken());
    int resultCount = Integer.parseInt(tokenizer.nextToken());

    int[] prefixSum = initArray(length);

    for (int i = 2; i <= length; i++) {
      prefixSum[i] += prefixSum[i - 1];
    }

    printRangeSums(resultCount, prefixSum);
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void printRangeSums(int resultCount, int[] prefixSum) throws IOException {
    for (int i = 0; i < resultCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int start = Integer.parseInt(tokenizer.nextToken());
      int end = Integer.parseInt(tokenizer.nextToken());
      WRITER.write((prefixSum[end] - prefixSum[start - 1]) + "\n");
    }
  }

  private static int[] initArray(int length) throws IOException {
    int[] prefixSum = new int[length + 1];
    tokenizer = new StringTokenizer(READER.readLine());
    for (int i = 1; i <= length; i++) {
      prefixSum[i] = Integer.parseInt(tokenizer.nextToken());
    }
    return prefixSum;
  }
}
