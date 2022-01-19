package programmers.level3.네트워크_20220119;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  private boolean[] visit;
  private int result;

  public int dfsSolution(int n, int[][] computers) {
    visit = new boolean[n];
    result = 0;
    for (int i = 0; i < n; i++) {
      if (!visit[i]) {
        dfs(computers, i);
        result++;
      }
    }
    return result;
  }

  public int bfsSolution(int n, int[][] computers) {
    visit = new boolean[n];
    result = 0;
    for (int i = 0; i < n; i++) {
      bfs(computers, i);
    }
    return result;
  }

  private void dfs(int[][] computers, int current) {
    if (visit[current]) {
      return;
    }

    visit[current] = true;

    for (int i = 0; i < computers.length; i++) {
      if (!visit[i] && computers[current][i] == 1) {
        dfs(computers, i);
      }
    }

  }

  private void bfs(int[][] computers, int start) {
    if (visit[start]) {
      return;
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visit[start] = true;

    while (!queue.isEmpty()) {
      int current = queue.poll();

      for (int adjnode = 0; adjnode < computers.length; adjnode++) {
        if (!visit[adjnode] && computers[current][adjnode] != 0) {
          queue.add(adjnode);
          visit[adjnode] = true;
        }
      }
    }

    result++;
  }
}
