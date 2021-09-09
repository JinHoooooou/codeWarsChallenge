package algorithm.graph;

import java.util.Arrays;

public class Graph {

  public int[][] adjMatrix;
  public int vertexCount;

  public Graph(int vertexCount) {
    this.vertexCount = vertexCount;
    adjMatrix = new int[vertexCount][vertexCount];
  }

  public void addEdge(int u, int v) {
    //방향 그래프라면 adjMatrix[u][v]만 1
    //가중치 그래프라면 1대신 가중치 입력
    adjMatrix[u][v] = 1;
    adjMatrix[v][u] = 1;
  }

  public void removeEdge(int u, int v) {
    //방향 그래프라면 adjMatrix[u][v]만 0
    adjMatrix[u][v] = 0;
    adjMatrix[v][u] = 0;
  }

  public boolean isEdge(int u, int v) {
    return adjMatrix[u][v] == 1;
  }

  public int[] findAdjacentVertex(int u) {
    return Arrays.stream(adjMatrix[u]).filter(x -> x != 0).toArray();
  }
}
