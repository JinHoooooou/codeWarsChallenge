package baekjoon.shortest_path.해킹_20220325;

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

  public static void main(String[] args) throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
    int testCount = Integer.parseInt(reader.readLine());
    StringBuilder result = new StringBuilder();

    while (testCount-- > 0) {
      StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
      int vertexCount = Integer.parseInt(tokenizer.nextToken());
      int edgeCount = Integer.parseInt(tokenizer.nextToken());
      int source = Integer.parseInt(tokenizer.nextToken());

      List<int[]>[] adjList = initAdjList(vertexCount, edgeCount);
      int[] distanceFromSource = dijkstra(adjList, source);

      result.append(formatResult(distanceFromSource));
    }
    System.out.print(result.toString().trim());
  }

  private static String formatResult(int[] distanceFromSource) {
    int affectedCount = 0;
    int min = 0;
    for (int i = 1; i < distanceFromSource.length; i++) {
      if (distanceFromSource[i] != Integer.MAX_VALUE) {
        affectedCount++;
        min = Math.max(min, distanceFromSource[i]);
      }
    }
    return String.format("%d %d\n", affectedCount, min);
  }

  private static List<int[]>[] initAdjList(int vertexCount, int edgeCount) throws IOException {
    List<int[]>[] adjList = new List[vertexCount + 1];

    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }

    for (int i = 0; i < edgeCount; i++) {
      StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
      int to = Integer.parseInt(tokenizer.nextToken());
      int from = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());
      adjList[from].add(new int[]{to, weight});
    }
    return adjList;
  }

  private static int[] dijkstra(List<int[]>[] adjList, int source) {
    int[] distanceFromSource = new int[adjList.length];
    Arrays.fill(distanceFromSource, Integer.MAX_VALUE);
    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparing(x -> x[1]));

    priorityQueue.add(new int[]{source, 0});
    distanceFromSource[source] = 0;

    while (!priorityQueue.isEmpty()) {
      int current = priorityQueue.poll()[0];

      if (distanceFromSource[current] == Integer.MAX_VALUE) {
        continue;
      }

      for (int[] outgoingEdge : adjList[current]) {
        int to = outgoingEdge[0];
        int weight = outgoingEdge[1];
        if (distanceFromSource[to] > distanceFromSource[current] + weight) {
          distanceFromSource[to] = distanceFromSource[current] + weight;
          priorityQueue.add(new int[]{to, distanceFromSource[to]});
        }
      }
    }
    return distanceFromSource;
  }
}
