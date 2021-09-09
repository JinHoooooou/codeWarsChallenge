package algorithm.union_find;

public class DisjointSet {

  private int[] root;
  private int[] rank;

  public void makeSet(int size) {
    root = new int[size];
    rank = new int[size];
    for (int i = 0; i < size; i++) {
      root[i] = i;
      rank[i] = 1;
    }
  }

  public int find(int x) {
    if (root[x] == x) {
      return x;
    }
    return root[x] = find(root[x]);
  }


  public void union(int x, int y) {
    x = find(x);
    y = find(y);

    if (x == y) {
      return;
    }

    if (rank[y] > rank[x]) {
      root[x] = y;
    } else {
      root[y] = x;

      if (rank[x] == rank[y]) {
        rank[x]++;
      }
    }
  }
}
