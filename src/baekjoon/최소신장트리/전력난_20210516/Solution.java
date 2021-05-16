package baekjoon.최소신장트리.전력난_20210516;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int[] parents;

  public static void main(String[] args) throws IOException {

    while (true) {
      tokenizer = new StringTokenizer(READER.readLine());
      int vertexCount = Integer.parseInt(tokenizer.nextToken());
      int edgeCount = Integer.parseInt(tokenizer.nextToken());

      if (vertexCount == 0 && edgeCount == 0) {
        break;
      }
      parents = new int[vertexCount];
      List<int[]> edges = new ArrayList<>();

      int cost = 0;
      for (int i = 0; i < edgeCount; i++) {
        tokenizer = new StringTokenizer(READER.readLine());
        int from = Integer.parseInt(tokenizer.nextToken());
        int to = Integer.parseInt(tokenizer.nextToken());
        int weight = Integer.parseInt(tokenizer.nextToken());
        edges.add(new int[]{from, to, weight});
        cost += weight;
      }

      edges.sort(Comparator.comparingInt(o -> o[2]));
      kruskal(edges, cost);
    }
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void kruskal(List<int[]> edges, int cost) throws IOException {
    for (int i = 0; i < parents.length; i++) {
      parents[i] = i;
    }

    for (int i = 0; i < edges.size(); i++) {
      int[] current = edges.get(i);
      int from = current[0];
      int to = current[1];
      int weight = current[2];
      if (find(from) != find(to)) {
        union(from, to);
        cost -= weight;
      }
    }

    WRITER.write(cost + "\n");
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
