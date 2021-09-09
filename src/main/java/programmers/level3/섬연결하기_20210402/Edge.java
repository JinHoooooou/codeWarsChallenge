package programmers.level3.섬연결하기_20210402;

public class Edge implements Comparable<Edge> {

  int from;
  int to;
  int cost;

  public Edge(int from, int to, int cost) {
    this.from = from;
    this.to = to;
    this.cost = cost;
  }

  @Override
  public int compareTo(Edge o) {
    return this.cost - o.cost;
  }
}
