package baekjoon.최단경로.중량제한_1939_20210708;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;
  private static List<int[]>[] adjList;
  private static int max;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    initAdjList();
    tokenizer = new StringTokenizer(READER.readLine());
    int source = Integer.parseInt(tokenizer.nextToken());
    int destination = Integer.parseInt(tokenizer.nextToken());

    int result = getMaxWeight(source, destination);

    WRITER.write(result + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int getMaxWeight(int source, int destination) {
    int low = 1;
    int high = max;
    int result = Integer.MIN_VALUE;
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visit = new boolean[vertexCount + 1];

    while (low <= high) {
      int mid = (low + high) / 2;
      queue.add(source);
      visit[source] = true;

      if (isExistPath(queue, visit, mid, destination)) {
        result = Math.max(result, mid);
        low = mid + 1;
      } else {
        high = mid - 1;
      }

      visit = new boolean[vertexCount + 1];
      queue.clear();
    }
    return result;
  }

  private static void initAdjList() throws IOException {
    adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new int[]{to, weight});
      adjList[to].add(new int[]{from, weight});
      max = Math.max(max, weight);
    }
  }

  private static boolean isExistPath(Queue<Integer> queue, boolean[] visit, int mid,
      int destination) {

    while (!queue.isEmpty()) {
      int current = queue.poll();
      for (int[] adjEdge : adjList[current]) {
        int to = adjEdge[0];
        int weight = adjEdge[1];
        if (weight >= mid) {
          if (current == destination) {
            return true;
          }
          if (!visit[to]) {
            visit[to] = true;
            queue.add(to);
          }
        }
      }
    }
    return false;
  }

}
