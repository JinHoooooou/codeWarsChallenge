package programmers.level3.네트워크_20210224;

public class Solution {

  int count = 0;

  public int solution(int n, int[][] computers) {
    boolean[] visit = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (!visit[i]) {
        connectNetwork(computers, visit, i);
        count++;
      }
    }

    return count;
  }

  private void connectNetwork(int[][] computers, boolean[] visit, int current) {
    if (visit[current]) {
      return;
    }

    visit[current] = true;
    for (int i = 0; i < computers[current].length; i++) {
      if (computers[current][i] == 1) {
        connectNetwork(computers, visit, i);
      }
    }

  }

}
