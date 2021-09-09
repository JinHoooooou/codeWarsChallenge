package programmers.level3.섬연결하기_20210402;

import java.util.Arrays;

public class Kruskal {

  private int[] parents;
  private int[] heights;

  public int solution(int n, int[][] costs) {
    Edge[] edges = buildEdges(costs);
    Arrays.sort(edges);

    parents = new int[n];
    heights = new int[n];
    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }

    int minCost = 0;
    for (Edge edge : edges) {
      if (find(edge.from) != find(edge.to)) {
        union(edge.from, edge.to);
        minCost += edge.cost;
      }
    }

    return minCost;
  }

  private Edge[] buildEdges(int[][] costs) {
    Edge[] edges = new Edge[costs.length];
    for (int i = 0; i < edges.length; i++) {
      int from = costs[i][0];
      int to = costs[i][1];
      int cost = costs[i][2];

      edges[i] = new Edge(from, to, cost);
    }
    return edges;
  }

  private int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }

  private void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from == to) {
      return;
    }

    if (heights[from] < heights[to]) {
      parents[from] = to;
    } else {
      parents[to] = from;
    }
    if (heights[from] == heights[to]) {
      heights[from]++;
    }
  }
}
