package baekjoon.DFS와BFS.연결요소의개수_11724_20210512;

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

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());

    int[][] adjMatrix = new int[vertexCount + 1][vertexCount + 1];
    boolean[] visit = new boolean[vertexCount + 1];
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());

      adjMatrix[from][to] = 1;
      adjMatrix[to][from] = 1;
    }

    int connectCount = 0;
    for (int i = 1; i <= vertexCount; i++) {
      if (!visit[i]) {
        //dfs(adjMatrix, visit, i);
        bfs(adjMatrix, visit, i);
        connectCount++;
      }
    }

    StringBuilder result = new StringBuilder(connectCount + "");
    WRITER.write(result.toString());

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void bfs(int[][] adjMatrix, boolean[] visit, int vertex) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(vertex);

    while (!queue.isEmpty()) {
      int current = queue.poll();
      if (visit[current]) {
        continue;
      }
      visit[current] = true;
      for (int i = 1; i < adjMatrix.length; i++) {
        if (!visit[i] && adjMatrix[current][i] == 1) {
          queue.add(i);
        }
      }
    }
  }

  private static void dfs(int[][] adjMatrix, boolean[] visit, int vertex) {
    if (visit[vertex]) {
      return;
    }
    visit[vertex] = true;
    for (int i = 1; i <= adjMatrix[vertex].length - 1; i++) {
      if (!visit[i] && adjMatrix[vertex][i] == 1) {
        dfs(adjMatrix, visit, i);
      }
    }
  }
}
