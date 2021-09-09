package baekjoon.최소신장트리.최소스패닝트리_1197_20210414;

import baekjoon.Input;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PrimSolution {

  private static int vertexCount;
  private static int edgeCount;
  private static List<Edge>[] adjList;

  public static void main(String[] args) throws IOException {
    enterInput();

    System.out.println(prim(1));
  }

  private static int prim(int startVertex) {
    boolean[] visit = new boolean[vertexCount + 1];
    PriorityQueue<Edge> queue = new PriorityQueue<>();
    queue.add(new Edge(startVertex, 0));

    int minWeight = 0;
    while (!queue.isEmpty()) {
      Edge minEdge = queue.poll();
      int targetVertex = minEdge.to;
      if (visit[targetVertex]) {
        continue;
      }

      visit[targetVertex] = true;
      minWeight += minEdge.weight;

      for (Edge adjEdge : adjList[targetVertex]) {
        if (!visit[adjEdge.to]) {
          queue.add(adjEdge);
        }
      }
    }

    return minWeight;
  }

  private static void enterInput() throws IOException {
    StringTokenizer stringTokenizer = new StringTokenizer(Input.READER.readLine());
    vertexCount = Integer.parseInt(stringTokenizer.nextToken());
    edgeCount = Integer.parseInt(stringTokenizer.nextToken());

    adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      int from = Integer.parseInt(stringTokenizer.nextToken());
      int to = Integer.parseInt(stringTokenizer.nextToken());
      int weight = Integer.parseInt(stringTokenizer.nextToken());

      adjList[from].add(new Edge(to, weight));
      adjList[to].add(new Edge(from, weight));
    }
    Input.READER.close();
  }
}
