package baekjoon.DFS와BFS.바이러스_2606_20210329;

import java.util.Scanner;

public class Solution {

  private int virusComputerCount;
  private int[][] computers;
  private boolean[] visit;

  public void main(String[] args) {
    enterInput();
    searchNetwork(computers, visit, 0);
    System.out.println(virusComputerCount);
  }

  public void enterInput() {
    Scanner scanner = new Scanner(System.in);
    int computerCount = scanner.nextInt();
    int edgeCount = scanner.nextInt();
    this.computers = new int[computerCount][computerCount];
    this.visit = new boolean[computerCount];
    this.virusComputerCount = 0;

    for (int i = 0; i < edgeCount; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      computers[u][v] = 1;
      computers[v][u] = 1;
    }
  }

  private void searchNetwork(int[][] computers, boolean[] visit, int current) {
    if (visit[current]) {
      virusComputerCount--;
      return;
    }

    visit[current] = true;
    for (int i = 0; i < computers.length; i++) {
      if (computers[current][i] == 1) {
        virusComputerCount++;
        searchNetwork(computers, visit, i);
      }
    }
  }
}
