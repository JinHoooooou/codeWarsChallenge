package programmers.printer;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

  public int solution(int[] priorities, int location) {
    Queue<Integer> priorityQueue = getPriorityQueue(priorities);

    int order = 1;
    while (priorityQueue.size() != 0) {
      for (int i = 0; i < priorities.length; i++) {
        if (priorities[i] == priorityQueue.element()) {
          if (i == location) {
            return order;
          }
          order++;
          priorityQueue.remove();
        }
      }
    }

    return order;
  }

  private Queue<Integer> getPriorityQueue(int[] priorities) {
    Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < priorities.length; i++) {
      priorityQueue.offer(priorities[i]);
    }
    return priorityQueue;
  }
}
