package baekjoon.정렬.회의실배정_20210703;

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
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int length = Integer.parseInt(tokenizer.nextToken());
    int[][] startEndTimes = init(length);

    int count = 0;
    int prevEndTime = 0;
    for (int i = 0; i < length; i++) {
      if (prevEndTime <= startEndTimes[i][0]) {
        prevEndTime = startEndTimes[i][1];
        count++;
      }
    }

    WRITER.write(count + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] init(int length) throws IOException {
    int[][] startEndTimes = new int[length][];
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int start = Integer.parseInt(tokenizer.nextToken());
      int end = Integer.parseInt(tokenizer.nextToken());
      startEndTimes[i] = new int[]{start, end};
    }

    Arrays.sort(startEndTimes, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
      }
    });
    return startEndTimes;
  }

}
