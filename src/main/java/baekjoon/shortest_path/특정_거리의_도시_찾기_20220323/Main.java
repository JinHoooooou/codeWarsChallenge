package baekjoon.shortest_path.특정_거리의_도시_찾기_20220323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader reader;
  private static StringTokenizer tokenizer;

  private static int vertexCount;
  private static int edgeCount;
  private static int k;
  private static int source;

  public static void main(String[] args) throws IOException {
    initFromInput();
    List<int[]>[] adjList = buildAdjList();
    String result = dijkstra(adjList);

    System.out.print(result.isEmpty() ? "-1" : result.trim());
  }

  private static List<int[]>[] buildAdjList() throws IOException {
    List<int[]>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(reader.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      adjList[from].add(new int[]{to, 1});
    }
    return adjList;
  }

  private static void initFromInput() throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
    tokenizer = new StringTokenizer(reader.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());
    k = Integer.parseInt(tokenizer.nextToken());
    source = Integer.parseInt(tokenizer.nextToken());
  }

  private static String dijkstra(List<int[]>[] adjList) {
    int[] distanceFromSource = new int[vertexCount + 1];
    Arrays.fill(distanceFromSource, Integer.MAX_VALUE);
    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparing(y -> y[1]));
    boolean[] visit = new boolean[vertexCount + 1];

    distanceFromSource[source] = 0;
    priorityQueue.add(new int[]{source, 0});

    while (!priorityQueue.isEmpty()) {
      int[] current = priorityQueue.poll();
      if (visit[current[0]]) {
        continue;
      }

      visit[current[0]] = true;

      for (int[] adjEdge : adjList[current[0]]) {
        int to = adjEdge[0];
        int weight = adjEdge[1];
        if (distanceFromSource[to] > current[1] + weight) {
          distanceFromSource[to] = current[1] + weight;
          priorityQueue.add(new int[]{to, current[1] + weight});
        }
      }
    }
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= vertexCount; i++) {
      if (distanceFromSource[i] == k) {
        result.append(i + "").append("\n");
      }
    }
    return result.toString();
  }
}
