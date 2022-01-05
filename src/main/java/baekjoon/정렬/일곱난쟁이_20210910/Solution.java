package baekjoon.정렬.일곱난쟁이_20210910;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int[] heights = new int[9];
    for (int i = 0; i < 9; i++) {
      heights[i] = Integer.parseInt(READER.readLine());
    }
    Arrays.sort(heights);
    int heightSum = Arrays.stream(heights).sum();

    int spy1 = 0;
    int spy2 = 0;
    for (int i = 0; i < heights.length; i++) {
      for (int j = i + 1; j < heights.length; j++) {
        if (heightSum - heights[i] - heights[j] == 100) {
          spy1 = i;
          spy2 = j;
          break;
        }
      }
    }

    for (int i = 0; i < heights.length; i++) {
      if (i != spy1 && i != spy2) {
        WRITER.write(heights[i] + "\n");
      }
    }

    WRITER.flush();
    WRITER.close();
    READER.close();

  }
}
