package baekjoon.mst.도시분할계획_20220116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String args[]) throws IOException {
    String line = READER.readLine();
    int vertexCount = Integer.parseInt(line.split(" ")[0]);
    int edgeCount = Integer.parseInt(line.split(" ")[1]);

    // kruskal(vertexCount, edgeCount);
    prim(vertexCount, edgeCount);
  }

  private static void kruskal(int vertexCount, int edgeCount) throws IOException {
    int[][] edges = buildEdges(edgeCount);
    int[] parents = makeSet(vertexCount);
    int result = 0;
    int maxWeight = 0;

    for (int i = 0; i < edgeCount; i++) {
      int source = edges[i][0];
      int destination = edges[i][1];
      int weight = edges[i][2];
      if (find(parents, source) != find(parents, destination)) {
        maxWeight = Math.max(weight, maxWeight);
        result += weight;
        union(parents, source, destination);
      }
    }

    result -= maxWeight;
    System.out.println(result);
  }

  private static int[][] buildEdges(int edgeCount) throws IOException {
    int[][] edges = new int[edgeCount][];

    for (int i = 0; i < edgeCount; i++) {
      String[] parts = READER.readLine().split(" ");
      int source = Integer.parseInt(parts[0]);
      int destination = Integer.parseInt(parts[1]);
      int weight = Integer.parseInt(parts[2]);
      edges[i] = new int[]{source, destination, weight};
    }
    Arrays.sort(edges, Comparator.comparingInt(x -> x[2]));
    return edges;
  }

  private static int[] makeSet(int vertexCount) {
    int[] parents = new int[vertexCount + 1];
    for (int i = 1; i < vertexCount + 1; i++) {
      parents[i] = i;
    }
    return parents;
  }

  private static int find(int[] parents, int x) {
    if (x == parents[x]) {
      return x;
    }

    return parents[x] = find(parents, parents[x]);
  }

  private static void union(int[] parents, int x, int y) {
    x = find(parents, x);
    y = find(parents, y);

    if (x == y) {
      return;
    }
    if (x > y) {
      parents[y] = x;
    } else {
      parents[x] = y;
    }

  }

  private static void prim(int vertexCount, int edgeCount) throws IOException {
    List<int[]>[] graph = buildGraph(vertexCount, edgeCount);
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
    boolean[] visit = new boolean[vertexCount + 1];
    int result = 0;
    int maxWeight = Integer.MIN_VALUE;

    queue.add(new int[]{1, 0});

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int destination = current[0];
      int weight = current[1];

      if (visit[destination]) {
        continue;
      }

      visit[destination] = true;
      result += weight;
      maxWeight = Math.max(maxWeight, weight);

      for (int[] adjNode : graph[destination]) {
        int destinationOfAdjNode = adjNode[0];
        int weightOfAdjNode = adjNode[1];
        if (!visit[destinationOfAdjNode]) {
          queue.add(new int[]{destinationOfAdjNode, weightOfAdjNode});
        }
      }

    }

    result -= maxWeight;

    System.out.println(result);
  }

  private static List<int[]>[] buildGraph(int vertexCount, int edgeCount) throws IOException {
    List<int[]>[] graph = new List[vertexCount + 1];
    for (int i = 1; i < vertexCount + 1; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      String[] parts = READER.readLine().split(" ");
      int source = Integer.parseInt(parts[0]);
      int destination = Integer.parseInt(parts[1]);
      int weight = Integer.parseInt(parts[2]);
      graph[source].add(new int[]{destination, weight});
      graph[destination].add(new int[]{source, weight});
    }
    return graph;
  }
}
