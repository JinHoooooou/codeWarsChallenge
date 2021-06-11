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
      int[][] points = buildPoints(vertexCount);
      List<Integer>[] adjList = buildGraph(points, vertexCount);
      boolean[][] isPath = buildPaths(vertexCount, points);

      floyd(vertexCount, isPath);
      bfs(vertexCount, adjList);
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void floyd(int vertexCount, boolean[][] isPath) throws IOException {
    for (int k = 1; k <= vertexCount; k++) {
      for (int i = 1; i <= vertexCount; i++) {
        for (int j = 1; j <= vertexCount; j++) {
          isPath[i][j] = isPath[i][k] && isPath[k][j];
        }
      }
    }
    WRITER.write(isPath[1][vertexCount] ? "happy\n" : "sad\n");
  }

  private static boolean[][] buildPaths(int vertexCount, int[][] points) {
    boolean[][] isPath = new boolean[vertexCount + 1][vertexCount + 1];

    for (int i = 1; i <= vertexCount; i++) {
      int[] from = points[i];
      for (int j = 1; j <= vertexCount; j++) {
        int[] to = points[j];
        int weight = Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
        if (weight <= 1000) {
          isPath[i][j] = true;
          isPath[j][i] = true;
        }
      }
    }
    return isPath;
  }

  private static int[][] buildPoints(int vertexCount) throws IOException {
    int[][] points = new int[vertexCount + 1][];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int x = Integer.parseInt(tokenizer.nextToken());
      int y = Integer.parseInt(tokenizer.nextToken());
      points[i] = new int[]{x, y};
    }
    return points;
  }

  private static List<Integer>[] buildGraph(int[][] points, int vertexCount) {
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

  private static void bfs(int vertexCount, List<Integer>[] adjList) throws IOException {
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

    WRITER.write(visit[vertexCount] ? "happy\n" : "sad\n");
  }
}
