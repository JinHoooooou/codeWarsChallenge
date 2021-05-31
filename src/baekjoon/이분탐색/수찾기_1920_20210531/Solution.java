package baekjoon.이분탐색.수찾기_1920_20210531;

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
    int[] array = initArray();

    tokenizer = new StringTokenizer(READER.readLine());
    int targetCount = Integer.parseInt(tokenizer.nextToken());
    tokenizer = new StringTokenizer(READER.readLine());

    for (int i = 0; i < targetCount; i++) {
      int target = Integer.parseInt(tokenizer.nextToken());
      binarySearch(array, target);
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[] initArray() throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    int[] array = new int[length];
    tokenizer = new StringTokenizer(READER.readLine());

    for (int i = 0; i < length; i++) {
      array[i] = Integer.parseInt(tokenizer.nextToken());
    }
    Arrays.sort(array);
    return array;
  }

  private static void binarySearch(int[] array, int target) throws IOException {
    int startIndex = 0;
    int endIndex = array.length - 1;

    while (startIndex <= endIndex) {
      int midIndex = (startIndex + endIndex) / 2;
      if (target == array[midIndex]) {
        WRITER.write("1\n");
        return;
      } else if (target < array[midIndex]) {
        endIndex = midIndex - 1;
      } else {
        startIndex = midIndex + 1;
      }
    }

    WRITER.write("0\n");
  }
}
