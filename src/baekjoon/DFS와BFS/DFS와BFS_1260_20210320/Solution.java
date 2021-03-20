package baekjoon.DFS와BFS.DFS와BFS_1260_20210320;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

  private static int[][] adjMatrix;
  private static boolean[] visit;
  private static int vertexCount;
  private static int startVertex;
  private static String dfs = "";
  private static String bfs = "";

  public static void solution() {
    init();
    dfs(startVertex, 0);
    bfs();

    System.out.println(dfs);
    System.out.println(bfs);

  }


  private static void init() {
    Scanner scanner = new Scanner(System.in);
    String[] input = scanner.nextLine().split(" ");
    vertexCount = Integer.parseInt(input[0]);
    startVertex = Integer.parseInt(input[2]) - 1;
    int edgeCount = Integer.parseInt(input[1]);

    adjMatrix = new int[vertexCount][vertexCount];
    visit = new boolean[vertexCount];

    for (int i = 0; i < edgeCount; i++) {
      input = scanner.nextLine().split(" ");
      int from = Integer.parseInt(input[0]) - 1;
      int to = Integer.parseInt(input[1]) - 1;
      adjMatrix[from][to] = 1;
      adjMatrix[to][from] = 1;
    }
  }

  private static void dfs(int currentVertex, int currentCount) {
    if (currentCount == vertexCount) {
      return;
    }

    visit[currentVertex] = true;
    dfs += (currentVertex + 1) + " ";

    for (int i = 0; i < adjMatrix[currentVertex].length; i++) {
      if (adjMatrix[currentVertex][i] == 1 && !visit[i]) {
        dfs(i, currentCount + 1);
      }
    }
  }

  private static void bfs() {
    visit = new boolean[vertexCount];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(startVertex);
    visit[startVertex] = true;

    while (!queue.isEmpty()) {
      int currentVertex = queue.poll();
      bfs += (currentVertex + 1) + " ";
      for (int i = 0; i < adjMatrix[currentVertex].length; i++) {
        if (adjMatrix[currentVertex][i] == 1 && !visit[i]) {
          visit[i] = true;
          queue.add(i);
        }
      }
    }
  }
}
