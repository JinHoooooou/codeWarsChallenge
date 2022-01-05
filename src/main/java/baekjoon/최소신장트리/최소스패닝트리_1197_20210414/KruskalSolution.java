package baekjoon.최소신장트리.최소스패닝트리_1197_20210414;

import baekjoon.Input;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class KruskalSolution {

  private static int vertexCount;
  private static int edgeCount;
  private static int[][] weightSortedEdges;
  private static int[] roots;

  public static void main(String[] args) throws IOException {
    enterInput();

    System.out.println(kruskal());
  }

  private static void enterInput() throws IOException {

    StringTokenizer stringTokenizer = new StringTokenizer(Input.READER.readLine());
    vertexCount = Integer.parseInt(stringTokenizer.nextToken());
    edgeCount = Integer.parseInt(stringTokenizer.nextToken());

    roots = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      roots[i] = i;
    }

    weightSortedEdges = new int[edgeCount][3];
    for (int i = 0; i < edgeCount; i++) {
      stringTokenizer = new StringTokenizer(Input.READER.readLine());
      int from = Integer.parseInt(stringTokenizer.nextToken());
      int to = Integer.parseInt(stringTokenizer.nextToken());
      int cost = Integer.parseInt(stringTokenizer.nextToken());

      weightSortedEdges[i] = new int[]{from, to, cost};
    }

    Input.READER.close();
  }

  private static int kruskal() {
    Arrays.sort(weightSortedEdges, Comparator.comparingInt(o -> o[2]));
    int minWeight = 0;
    for (int i = 0; i < edgeCount; i++) {
      int[] minEdge = weightSortedEdges[i];
      int from = minEdge[0];
      int to = minEdge[1];
      int weight = minEdge[2];

      if (find(from) != find(to)) {
        union(from, to);
        minWeight += weight;
      }
    }
    return minWeight;
  }

  private static int find(int x) {
    if (roots[x] == x) {
      return x;
    }
    return roots[x] = find(roots[x]);
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from == to) {
      return;
    }
    roots[to] = from;
  }
}

