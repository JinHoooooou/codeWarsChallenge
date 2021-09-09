package baekjoon.최소신장트리.학교탐방하기_20210707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int vertexCount;
  private static int edgeCount;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    List<int[]>[] adjList = initAdjList();
    Comparator<int[]> natural = Comparator.comparingInt(o -> o[1]);
    Comparator<int[]> reverse = (o1, o2) -> o2[1] - o1[1];

    int worst = prim(adjList, natural);
    int best = prim(adjList, reverse);

    int result = worst - best;
    WRITER.write(result + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int prim(List<int[]>[] adjList, Comparator<int[]> order) {
    PriorityQueue<int[]> queue = new PriorityQueue<>(order);
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(new int[]{0, 0});

    int cost = 0;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int index = current[0];
      int weight = current[1];

      if (visit[index]) {
        continue;
      }
      visit[index] = true;
      cost += weight;
      for (int[] adjEdge : adjList[index]) {
        int to = adjEdge[0];
        if (!visit[to]) {
          queue.add(new int[]{to, adjEdge[1]});
        }
      }
    }

    return (vertexCount - cost) * (vertexCount - cost);
  }

  private static List<int[]>[] initAdjList() throws IOException {
    List<int[]>[] adjList = new List[vertexCount + 1];
    for (int i = 0; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    for (int i = 0; i < edgeCount + 1; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      adjList[from].add(new int[]{to, weight});
      adjList[to].add(new int[]{from, weight});
    }
    return adjList;
  }
}
