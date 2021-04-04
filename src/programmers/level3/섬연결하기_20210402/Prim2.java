package programmers.level3.섬연결하기_20210402;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prim2 {

  private boolean[] visit;
  private List<Edge>[] adjList;

  public int solution(int n, int[][] costs) {
    visit = new boolean[n];
    adjList = new List[n];
    for (int i = 0; i < n; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < costs.length; i++) {
      int from = costs[i][0];
      int to = costs[i][1];
      int cost = costs[i][2];

      adjList[from].add(new Edge(from, to, cost));
      adjList[to].add(new Edge(to, from, cost));
    }

    PriorityQueue<Edge> queue = new PriorityQueue<>(adjList[0]);
    visit[0] = true;
    int minCost = 0;

    while (!queue.isEmpty()) {
      Edge minDistanceEdge = queue.poll();

      if (visit[minDistanceEdge.to]) {
        continue;
      }
      minCost += minDistanceEdge.cost;
      visit[minDistanceEdge.to] = true;

      for (Edge edge : adjList[minDistanceEdge.to]) {
        if (!visit[edge.to]) {
          queue.add(edge);
        }
      }
    }

    return minCost;
  }
}
