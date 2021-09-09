package programmers.level3.섬연결하기_20210402;

import java.util.Arrays;

public class Prim1 {

  private int[] distance;
  private boolean[] visit;
  private int[][] adjMatrix;

  public int solution(int n, int[][] costs) {
    init(costs, n);

    int minCost = 0;
    distance[0] = 0;

    for (int i = 0; i < n; i++) {

      int minDistanceNode = getMinDistanceNode(n);
      int minDistance = distance[minDistanceNode];

      visit[minDistanceNode] = true;
      minCost += minDistance;

      for (int j = 0; j < n; j++) {
        if (!visit[j] && adjMatrix[minDistanceNode][j] > 0
            && adjMatrix[minDistanceNode][j] <= distance[j]) {
          distance[j] = adjMatrix[minDistanceNode][j];
        }
      }
    }

    return minCost;
  }

  private void init(int[][] costs, int n) {
    distance = new int[n];
    Arrays.fill(distance, Integer.MAX_VALUE);
    visit = new boolean[n];
    adjMatrix = new int[n][n];
    for (int i = 0; i < costs.length; i++) {
      int from = costs[i][0];
      int to = costs[i][1];
      int cost = costs[i][2];

      adjMatrix[from][to] = cost;
      adjMatrix[to][from] = cost;
    }
  }

  private int getMinDistanceNode(int vertexSize) {
    int minDistance = Integer.MAX_VALUE;
    int minDistanceNode = -1;

    for (int j = 0; j < vertexSize; j++) {
      if (!visit[j] && distance[j] <= minDistance) {
        minDistance = distance[j];
        minDistanceNode = j;
      }
    }

    return minDistanceNode;
  }
}
