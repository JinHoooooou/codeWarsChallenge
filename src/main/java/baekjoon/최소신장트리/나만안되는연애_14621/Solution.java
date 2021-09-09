package baekjoon.최소신장트리.나만안되는연애_14621;

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

  private static List<int[]> edges;
  private static List<int[]>[] adjList;
  private static int[] parents;


  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());
    edgeCount = Integer.parseInt(tokenizer.nextToken());

    tokenizer = new StringTokenizer(READER.readLine());
    String[] genders = new String[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      genders[i] = tokenizer.nextToken();
    }
    buildGraph();

    prim(genders);
    kruskal(genders);

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void buildGraph() throws IOException {
    adjList = new List[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      adjList[i] = new ArrayList<>();
    }
    edges = new ArrayList<>();

    for (int i = 0; i < edgeCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      int from = Integer.parseInt(tokenizer.nextToken());
      int to = Integer.parseInt(tokenizer.nextToken());
      int weight = Integer.parseInt(tokenizer.nextToken());

      edges.add(new int[]{from, to, weight});
      adjList[from].add(new int[]{to, weight});
      adjList[to].add(new int[]{from, weight});
    }
    edges.sort(Comparator.comparingInt(o -> o[2]));

  }

  private static void prim(String[] genders) throws IOException {
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
    boolean[] visit = new boolean[vertexCount + 1];
    queue.add(new int[]{1, 0});

    int connection = -1;
    int weightSum = 0;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      if (visit[current[0]]) {
        continue;
      }
      visit[current[0]] = true;
      weightSum += current[1];
      connection++;

      for (int[] adjEdge : adjList[current[0]]) {

        if (!genders[current[0]].equals(genders[adjEdge[0]])) {
          queue.add(new int[]{adjEdge[0], adjEdge[1]});
        }
      }
    }

    WRITER.write(connection == vertexCount - 1 ? weightSum + "\n" : "-1\n");
  }

  private static void kruskal(String[] genders) throws IOException {
    parents = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      parents[i] = i;
    }

    int weightSum = 0;
    int connection = 0;
    for (int[] current : edges) {
      int from = current[0];
      int to = current[1];
      int weight = current[2];

      String toGender = genders[to];
      String fromGender = genders[from];

      if (find(from) != find(to)) {
        if (!toGender.equals(fromGender)) {
          union(from, to);
          connection++;
          weightSum += weight;
        }
      }
    }

    WRITER.write(connection == vertexCount - 1 ? weightSum + "\n" : "-1\n");
  }

  private static void union(int x, int y) {
    x = find(x);
    y = find(y);

    if (x != y) {
      parents[y] = x;
    }
  }

  private static int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }
}

