package baekjoon.이분탐색.나무자르기_2805_20210615;

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

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    long target = Long.parseLong(tokenizer.nextToken());

    long[] array = new long[length];
    tokenizer = new StringTokenizer(READER.readLine());
    for (int i = 0; i < length; i++) {
      array[i] = Long.parseLong(tokenizer.nextToken());
    }
    Arrays.sort(array);

    long start = 0;
    long end = array[length - 1];

    while (start <= end) {
      long mid = (start + end) / 2;
      long sum = getLeftWoodsLength(array, mid);
      if (sum >= target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    WRITER.write(end + "");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static long getLeftWoodsLength(long[] array, long mid) {
    long sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += Math.max(0, array[i] - mid);
    }
    return sum;
  }
}
