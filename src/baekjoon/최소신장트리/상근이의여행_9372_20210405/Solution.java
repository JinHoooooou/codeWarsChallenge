package baekjoon.최소신장트리.상근이의여행_9372_20210405;

import java.util.Scanner;

public class Solution {

  //1. union find -> kruskal 알고리즘으로 품
  //2. 근데 가중치도 없고, 반드시 연결되어있다고 문제에 있기 때문에 그냥 vertex - 1 출력하면됨..
  //3. 그래도 알고리즘 공부한다는 느낌으로 코드는 수정하지 않음 ........
  private static int[] parents;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCount = scanner.nextInt();
    int[] test = new int[testCount];

    for (int i = 0; i < testCount; i++) {
      int vertexCount = scanner.nextInt();
      int edgeCount = scanner.nextInt();
      parents = new int[vertexCount];
      int count = 0;
      for (int j = 0; j < vertexCount; j++) {
        parents[j] = j;
      }

      for (int j = 0; j < edgeCount; j++) {
        int from = scanner.nextInt() - 1;
        int to = scanner.nextInt() - 1;

        if (find(from) != find(to)) {
          count++;
          union(from, to);
        }
      }
      test[i] = count;
    }
    for (int result : test) {
      System.out.println(result);
    }
  }

  private static void union(int x, int y) {
    x = find(x);
    y = find(y);

    if (x == y) {
      return;
    }
    parents[y] = x;
  }

  private static int find(int x) {
    if (parents[x] == x) {
      return x;
    }
    return parents[x] = find(parents[x]);
  }
}