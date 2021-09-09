package baekjoon.이분탐색.숫자카드_10815_20210720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    int[] array = initArray();

    int length = Integer.parseInt(READER.readLine());
    tokenizer = new StringTokenizer(READER.readLine());
    for (int i = 0; i < length; i++) {
      int target = Integer.parseInt(tokenizer.nextToken());
      WRITER.write(binarySearch(array, target) ? "1 " : "0 ");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static boolean binarySearch(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      } else {
        return true;
      }
    }
    return false;
  }

  private static int[] initArray() throws IOException {
    int length = Integer.parseInt(READER.readLine());
    int[] array = new int[length];
    tokenizer = new StringTokenizer(READER.readLine());

    for (int i = 0; i < length; i++) {
      array[i] = Integer.parseInt(tokenizer.nextToken());
    }
    Arrays.sort(array);
    return array;
  }
}
