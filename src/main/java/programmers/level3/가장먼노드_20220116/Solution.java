package programmers.level3.가장먼노드_20220116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

  public int solution(int n, int[][] edge) {
    List<Integer>[] graph = buildGraph(n, edge);
    int[] distanceFrom1Node = getDistanceFrom1Node(n, graph);

    int max = Arrays.stream(distanceFrom1Node).max().getAsInt();
    int count = (int) Arrays.stream(distanceFrom1Node).filter(x -> x == max).count();

    return count;
  }

  private int[] getDistanceFrom1Node(int n, List<Integer>[] graph) {
    Queue<Integer> queue = new LinkedList<>();
    int[] distanceFrom1Node = new int[n + 1];
    boolean[] visit = new boolean[n + 1];

    queue.add(1);
    visit[1] = true;
    distanceFrom1Node[1] = 0;

    while (!queue.isEmpty()) {
      int current = queue.poll();

      for (int adjNode : graph[current]) {
        if (!visit[adjNode]) {
          visit[adjNode] = true;
          distanceFrom1Node[adjNode] = distanceFrom1Node[current] + 1;
          queue.add(adjNode);
        }
      }
    }
    return distanceFrom1Node;
  }

  private List<Integer>[] buildGraph(int n, int[][] edge) {
    List<Integer>[] graph = new List[n + 1];
    for (int i = 1; i < n + 1; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int i = 0; i < edge.length; i++) {
      int source = edge[i][0];
      int destination = edge[i][1];
      graph[source].add(destination);
      graph[destination].add(source);
    }
    return graph;
  }
}
