package baekjoon.우선순위큐.최소힙_1927_20210603;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int count = Integer.parseInt(tokenizer.nextToken());
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

    StringBuilder result = new StringBuilder();
    while (count-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int number = Integer.parseInt(tokenizer.nextToken());
      if (number == 0) {
        result.append(queue.isEmpty() ? 0 + "\n" : queue.poll() + "\n");
      } else {
        queue.add(number);
      }
    }

    WRITER.write(result.toString());
    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
