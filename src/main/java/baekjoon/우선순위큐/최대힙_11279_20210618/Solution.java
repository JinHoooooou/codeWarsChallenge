package baekjoon.우선순위큐.최대힙_11279_20210618;

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
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

    while (count-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int number = Integer.parseInt(tokenizer.nextToken());

      if (number == 0) {
        if (queue.isEmpty()) {
          WRITER.write("0\n");
        } else {
          WRITER.write(queue.poll() + "\n");
        }
      } else {
        queue.add(number);
      }
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}

