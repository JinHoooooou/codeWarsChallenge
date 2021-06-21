package baekjoon.최소신장트리.전기가부족해_10423_20210621;

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
    tokenizer = new StringTokenizer(READER.readLine());
    int vertexCount = Integer.parseInt(tokenizer.nextToken());
    int edgeCount = Integer.parseInt(tokenizer.nextToken());
    int plantCount = Integer.parseInt(tokenizer.nextToken());

    initParents(vertexCount, plantCount);
    List<int[]> edges = buildEdges(edgeCount);
    kruskal(edges);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void initParents(int vertexCount, int plantCount) throws IOException {
    parents = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      parents[i] = i;
    }

    tokenizer = new StringTokenizer(READER.readLine());
    int plantRoot = Integer.parseInt(tokenizer.nextToken());
    for (int i = 1; i < plantCount; i++) {
      int plant = Integer.parseInt(tokenizer.nextToken());
      parents[plant] = plantRoot;
    }
  }

  private static List<int[]> buildEdges(int edgeCount) throws IOException {
    List<int[]> edges = new ArrayList<>();
    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new int[]{from, to, weight});
    }
    edges.sort(Comparator.comparingInt(o -> o[2]));
    return edges;
  }

  private static void kruskal(List<int[]> edges) throws IOException {
    int sum = 0;
    for (int i = 0; i < edges.size(); i++) {
      int[] current = edges.get(i);
      int from = current[0];
      int to = current[1];
      int weight = current[2];
      if (find(from) != find(to)) {
        union(from, to);
        sum += weight;
      }
    }
    WRITER.write(sum + "\n");
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);

    if (from != to) {
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
