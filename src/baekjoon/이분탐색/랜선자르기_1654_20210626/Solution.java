package baekjoon.이분탐색.랜선자르기_1654_20210626;

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
    int arrayLength = Integer.parseInt(tokenizer.nextToken());
    int wantedCount = Integer.parseInt(tokenizer.nextToken());

    int[] lanCableLengths = buildLanCableLengths(arrayLength);
    binarySearch(arrayLength, wantedCount, lanCableLengths);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[] buildLanCableLengths(int arrayLength) throws IOException {
    int[] array = new int[arrayLength];
    for (int i = 0; i < arrayLength; i++) {
      int length = Integer.parseInt(READER.readLine());
      array[i] = length;
    }
    Arrays.sort(array);
    return array;
  }

  private static void binarySearch(int arrayLength, int wantedCount, int[] lanCableLengths)
      throws IOException {
    long end = lanCableLengths[arrayLength - 1];
    long start = 1;
    long mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      int count = 0;
      for (int i = 0; i < arrayLength; i++) {
        count += (lanCableLengths[i] / mid);
      }
      if (count < wantedCount) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    WRITER.write(end + "\n");
  }
}
