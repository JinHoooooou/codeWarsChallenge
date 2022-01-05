package baekjoon.최소신장트리.별자리_4386_20210416;

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
  private static int vertexCount;
  private static List<Double[]> edges;
  private static int[] roots;

  public static void main(String[] args) throws IOException {
    enterInput();

    WRITER.write(String.valueOf(kruskal()));

    WRITER.close();
    READER.close();
  }

  private static double kruskal() {
    double result = 0;
    for (Double[] edge : edges) {
      int from = edge[0].intValue();
      int to = edge[1].intValue();
      double weight = edge[2];

      if (find(from) != find(to)) {
        union(from, to);
        result += weight;
      }
    }
    return result;
  }

  private static int find(int x) {
    if (roots[x] == x) {
      return x;
    }
    return roots[x] = find(roots[x]);
  }

  private static void union(int from, int to) {
    from = find(from);
    to = find(to);
    if (from == to) {
      return;
    }
    roots[to] = from;
  }

  private static void enterInput() throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    vertexCount = Integer.parseInt(tokenizer.nextToken());

    roots = initRoots();
    double[][] points = getPoint();
    edges = getWeightSortedEdges(points);
  }

  private static int[] initRoots() {
    int[] result = new int[vertexCount + 1];
    for (int i = 1; i <= vertexCount; i++) {
      result[i] = i;
    }
    return result;
  }

  private static double[][] getPoint() throws IOException {
    double[][] points = new double[vertexCount + 1][2];
    for (int i = 1; i <= vertexCount; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      double x = Double.parseDouble(tokenizer.nextToken());
      double y = Double.parseDouble(tokenizer.nextToken());
      points[i] = new double[]{x, y};
    }
    return points;
  }

  private static List<Double[]> getWeightSortedEdges(double[][] points) {
    List<Double[]> result = new ArrayList<>();
    for (int i = 1; i <= vertexCount; i++) {
      for (int j = i + 1; j <= vertexCount; j++) {
        double weight = getWeight(points[i][0], points[j][0], points[i][1], points[j][1]);
        result.add(new Double[]{(double) i, (double) j, weight});
      }
    }
    result.sort(Comparator.comparingDouble(o -> o[2]));
    return result;
  }

  private static double getWeight(double x1, double x2, double y1, double y2) {
    double weight = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
    weight = Math.sqrt(weight);
    weight = (int) (weight * 100) / 100.00;

    return weight;
  }
}
