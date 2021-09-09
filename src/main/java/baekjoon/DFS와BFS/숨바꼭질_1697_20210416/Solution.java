package baekjoon.DFS와BFS.숨바꼭질_1697_20210416;

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
  private static boolean[] visit = new boolean[100001];
  private static int result = 0;

  public static void main(String[] args) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{source, 0});

    while (!queue.isEmpty()) {

      int[] current = queue.poll();
      int position = current[0];
      int seconds = current[1];
      if (position < 0 || position > 100000 || visit[position]) {
        continue;
      }

      visit[position] = true;
      if (position == destination) {
        result = seconds;
        break;
      }
      queue.add(new int[]{position + 1, seconds + 1});
      queue.add(new int[]{position - 1, seconds + 1});
      queue.add(new int[]{position * 2, seconds + 1});
    }

    WRITER.write(String.valueOf(result));

    READER.close();
    WRITER.close();
  }
}
