package baekjoon.최단경로.최소비용구하기_11779_20210709;

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
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static final int INF = 99999999;
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static int[] preVertex;

  public static void main(String[] args) throws IOException {
    vertexCount = Integer.parseInt(READER.readLine());
    edgeCount = Integer.parseInt(READER.readLine());
    List<int[]>[] adjList = initAdjList();

    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    preVertex = new int[vertexCount + 1];
    int[] distance = dijkstra(adjList, source);

    String path = getPath(source, destination);
    int minDistance = distance[destination];
    int count = path.replaceAll(" ", "").length();

    WRITER.write(minDistance + "\n");
    WRITER.write(count + "\n");
    WRITER.write(path);
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static String getPath(int source, int destination) {
    StringBuilder path = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int current = destination;
    while (current != source) {
      stack.push(current);
      current = preVertex[current];
    }
    stack.push(current);

    while (!stack.isEmpty()) {
      path.append(String.format("%d ", stack.pop()));
    }
    return path.toString().trim();
  }

  private static int[] dijkstra(List<int[]>[] adjList, int source) {
    int[] distance = new int[vertexCount + 1];
    Arrays.fill(distance, INF);
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

    queue.add(new int[]{source, 0});
    distance[source] = 0;

    while (!queue.isEmpty()) {
      int[] curEdge = queue.poll();
      int index = curEdge[0];
      if (distance[index] == 99999999) {
        continue;
      }

      for (int[] adjEdge : adjList[index]) {
        int to = adjEdge[0];
        int weight = adjEdge[1];
        if (distance[to] > distance[index] + weight) {
          preVertex[to] = index;
          distance[to] = distance[index] + weight;
          queue.add(new int[]{to, distance[to]});
        }
      }
    }
    return distance;
  }

  private static List<int[]>[] initAdjList() throws IOException {
    List<int[]>[] adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new int[]{to, weight});
    }
    return adjList;
  }
}
