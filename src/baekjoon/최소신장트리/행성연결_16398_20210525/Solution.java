package baekjoon.최소신장트리.행성연결_16398_20210525;

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
  private static int[] parents;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());

    kruskal(vertexCount);
    //prim(vertexCount);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void prim(int vertexCount) throws IOException {
    int[][] adjMatrix = new int[vertexCount + 1][vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 1; j <= vertexCount; j++) {
        adjMatrix[i][j] = Integer.parseInt(tokenizer.nextToken());
      }
    }

    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(new int[]{1, 0});

    long sumWeight = 0;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int to = current[0];
      int weight = current[1];

      if (visit[to]) {
        continue;
      }
      visit[to] = true;
      sumWeight += weight;

      for (int i = 1; i <= vertexCount; i++) {
        if (adjMatrix[to][i] != 0) {
          queue.add(new int[]{i, adjMatrix[to][i]});
        }
      }
    }

    WRITER.write(sumWeight + "");
  }

  private static void kruskal(int vertexCount) throws IOException {
    List<int[]> edges = new ArrayList<>();
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 1; j <= vertexCount; j++) {
        int weight = Integer.parseInt(tokenizer.nextToken());
        if (weight != 0) {
          edges.add(new int[]{i, j, weight});
        }
      }
    }

    edges.sort(Comparator.comparingInt(o -> o[2]));

    parents = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      parents[i] = i;
    }

    long sumWeight = 0;
    for (int i = 0; i < edges.size(); i++) {
      int[] current = edges.get(i);
      int from = current[0];
      int to = current[1];
      int weight = current[2];
      if (find(from) != find(to)) {
        union(from, to);
        sumWeight += weight;
      }
    }

    WRITER.write(sumWeight + "");
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from > to) {
      parents[to] = from;
    } else {
      parents[from] = to;
    }
  }

  private static int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }
}
