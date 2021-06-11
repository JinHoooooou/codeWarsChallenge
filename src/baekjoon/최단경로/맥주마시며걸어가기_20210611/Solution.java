package baekjoon.최단경로.맥주마시며걸어가기_20210611;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int test = Integer.parseInt(tokenizer.nextToken());
    while (test-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int vertexCount = Integer.parseInt(tokenizer.nextToken()) + 2;
      List<Integer>[] adjList = buildGraph(vertexCount);

      bfs(vertexCount, adjList);

      WRITER.write(bfs(vertexCount, adjList) ? "happy\n" : "sad\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static boolean bfs(int vertexCount, List<Integer>[] adjList) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(1);

    while (!queue.isEmpty()) {
      int current = queue.poll();

      if (visit[current]) {
        continue;
      }
      visit[current] = true;
      for (int adjVertex : adjList[current]) {
        if (!visit[adjVertex]) {
          queue.add(adjVertex);
        }
      }
    }
    return visit[vertexCount];
  }

  private static List<Integer>[] buildGraph(int vertexCount) throws IOException {
    int[][] points = new int[vertexCount + 1][];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int x = Integer.parseInt(tokenizer.nextToken());
      int y = Integer.parseInt(tokenizer.nextToken());
      points[i] = new int[]{x, y};
    }

    List<Integer>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 1; i <= vertexCount; i++) {
      int[] from = points[i];
      for (int j = 1; j <= vertexCount; j++) {
        int[] to = points[j];
        int weight = Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
        if (weight <= 1000) {
          adjList[i].add(j);
          adjList[j].add(i);
        }
      }
    }
    return adjList;
  }
}
