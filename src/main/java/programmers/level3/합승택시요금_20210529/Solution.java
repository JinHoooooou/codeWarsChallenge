package programmers.level3.합승택시요금_20210529;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

  public int solution(int n, int s, int a, int b, int[][] fares) {
    List<Edge>[] adjList = new List[n + 1];
    for (int i = 1; i <= n; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < fares.length; i++) {
      int from = fares[i][0];
      int to = fares[i][1];
      int cost = fares[i][2];

      adjList[from].add(new Edge(to, cost));
      adjList[to].add(new Edge(from, cost));
    }

    int[] distFromA = dijkstra(adjList, a);
    int[] distFromB = dijkstra(adjList, b);
    int[] distFromSource = dijkstra(adjList, s);

    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      int distance = distFromA[i] + distFromB[i] + distFromSource[i];
      min = Math.min(min, distance);
    }

    return min;
  }

  private int[] dijkstra(List<Edge>[] adjList, int source) {
    int[] distance = new int[adjList.length];
    Arrays.fill(distance, Integer.MAX_VALUE);
    PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
    queue.add(new Edge(source, 0));
    distance[source] = 0;

    while (!queue.isEmpty()) {
      Edge current = queue.poll();
      int to = current.to;

      for (Edge adjEdge : adjList[to]) {
        if (distance[adjEdge.to] > distance[to] + adjEdge.cost) {
          distance[adjEdge.to] = distance[to] + adjEdge.cost;
          queue.add(new Edge(adjEdge.to, distance[adjEdge.to]));
        }
      }
    }

    return distance;
  }
}

class Edge {

  int to;
  int cost;

  public Edge(int to, int cost) {
    this.to = to;
    this.cost = cost;
  }
}