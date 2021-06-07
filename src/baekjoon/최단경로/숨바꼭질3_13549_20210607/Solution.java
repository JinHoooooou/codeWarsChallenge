package baekjoon.최단경로.숨바꼭질3_13549_20210607;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int minSecond;

  public static void main(String[] args) throws IOException {
    minSecond = Integer.MAX_VALUE;
    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    Queue<int[]> queue = new LinkedList<>();
    boolean[] visit = new boolean[100001];
    queue.add(new int[]{source, 0});
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int position = current[0];
      int second = current[1];

      if (position == destination) {
        minSecond = Math.min(minSecond, second);
        continue;
      }

      if (visit[position]) {
        continue;
      }
      visit[position] = true;

      if (position - 1 >= 0 && !visit[position - 1]) {
        queue.add(new int[]{position - 1, second + 1});
      }
      if (position * 2 <= 100000 && !visit[position * 2]) {
        queue.add(new int[]{position * 2, second});
      }
      if (position + 1 <= 100000 && !visit[position + 1]) {
        queue.add(new int[]{position + 1, second + 1});
      }
    }

    WRITER.write(minSecond + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();

  }
}
