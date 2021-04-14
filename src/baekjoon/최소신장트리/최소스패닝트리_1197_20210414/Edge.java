package baekjoon.최소신장트리.최소스패닝트리_1197_20210414;

public class Edge implements Comparable<Edge> {

  int to;
  int weight;

  public Edge(int to, int weight) {
    this.to = to;
    this.weight = weight;
  }

  @Override
  public int compareTo(Edge o) {
    return this.weight - o.weight;
  }
}
