package baekjoon.DFS와BFS.이분그래프_1707_20210429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static StringTokenizer tokenizer;
  private static boolean isBipartite;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int testCase = Integer.parseInt(tokenizer.nextToken());
    while (testCase-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int vertexCount = Integer.parseInt(tokenizer.nextToken());
      int edgeCount = Integer.parseInt(tokenizer.nextToken());

      List<Integer>[] adjList = buildAdjList(vertexCount, edgeCount);
      int[] vertexColor = new int[vertexCount + 1];
      isBipartite = true;
      for (int i = 1; i <= vertexCount; i++) {
        if (!isBipartite) {
          break;
        }
        if (vertexColor[i] == 0) {
          bfs(adjList, vertexColor, i);
        }
      }
      System.out.println(isBipartite ? "YES" : "NO");
    }
  }

  private static void bfs(List<Integer>[] adjList, int[] vertexColor, int startVertex) {
    Queue<Integer> queue = new LinkedList<>();
    vertexColor[startVertex] = 1;
    queue.add(startVertex);

    while (!queue.isEmpty() && isBipartite) {
      int currentVertex = queue.poll();

      for (int adjVertex : adjList[currentVertex]) {
        if (vertexColor[adjVertex] == vertexColor[currentVertex]) {
          isBipartite = false;
          return;
        } else if (vertexColor[adjVertex] == 0) {
          vertexColor[adjVertex] = vertexColor[currentVertex] * -1;
          queue.add(adjVertex);
        }
      }
    }
  }

  private static List<Integer>[] buildAdjList(int vertexCount, int edgeCount) throws IOException {
    List<Integer>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(to);
      adjList[to].add(from);
    }
    return adjList;
  }
}
