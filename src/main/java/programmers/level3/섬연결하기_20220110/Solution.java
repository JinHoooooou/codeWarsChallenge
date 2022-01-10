package programmers.level3.섬연결하기_20220110;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

  public int solution(int n, int[][] costs) {
    //return kruskal(n, costs);
    return prim(n, costs);
  }

  private int prim(int n, int[][] costs) {
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
    boolean[] visit = new boolean[n];
    int[][] graph = buildGraph(n, costs);

    int result = 0;
    queue.add(new int[]{0, 0});
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int dest = current[0];
      int weight = current[1];
      if (visit[dest]) {
        continue;
      }

      visit[dest] = true;
      result += weight;

      for (int i = 0; i < n; i++) {
        if (!visit[i] && graph[dest][i] > 0) {
          queue.add(new int[]{i, graph[dest][i]});
        }
      }
    }
    return result;
  }

  private int[][] buildGraph(int n, int[][] costs) {
    int[][] graph = new int[n][n];
    for (int i = 0; i < costs.length; i++) {
      int source = costs[i][0];
      int dest = costs[i][1];
      int weight = costs[i][2];
      graph[source][dest] = weight;
      graph[dest][source] = weight;
    }
    return graph;
  }


  private int kruskal(int n, int[][] costs) {
    Arrays.sort(costs, Comparator.comparingInt(x -> x[2]));
    int[] parents = new int[n];
    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
    int result = 0;

    for (int i = 0; i < costs.length; i++) {
      int source = costs[i][0];
      int dest = costs[i][1];
      int weight = costs[i][2];
      if (getParent(parents, source) != getParent(parents, dest)) {
        union(parents, source, dest);
        result += weight;
      }
    }
    return result;
  }

  private void union(int[] parents, int source, int dest) {
    source = getParent(parents, source);
    dest = getParent(parents, dest);

    if (source == dest) {
      return;
    }
    if (source > dest) {
      parents[source] = dest;
    } else {
      parents[dest] = source;
    }

  }

  private int getParent(int[] parents, int x) {
    if (x == parents[x]) {
      return x;
    }
    return parents[x] = getParent(parents, parents[x]);
  }
}
