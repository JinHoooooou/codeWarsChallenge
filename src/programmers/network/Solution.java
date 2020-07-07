package programmers.network;

import java.util.Stack;

public class Solution {

  public boolean[] visit;

  public int solution(int n, int[][] computers) {
    visit = new boolean[computers.length];
    int networkCount = 0;

    for (int i = 0; i < computers.length; i++) {
      if (!visit[i]) {
        makeNetwork(computers, i);
        networkCount++;
      }
    }
    return networkCount;
  }

  private void makeNetwork(int[][] computers, int currentComputer) {
    Stack<Integer> computerStack = new Stack<>();
    computerStack.push(currentComputer);
    visit[currentComputer] = true;
    makeNetworkStack(computerStack, computers);
  }

  private void makeNetworkStack(Stack<Integer> computerStack, int[][] computers) {
    while (!computerStack.isEmpty()) {
      int targetComputer = computerStack.pop();
      for (int j = 0; j < computers[targetComputer].length; j++) {
        if (computers[targetComputer][j] == 1 && !visit[j]) {
          computerStack.push(j);
          visit[j] = true;
        }
      }
    }
  }
}
