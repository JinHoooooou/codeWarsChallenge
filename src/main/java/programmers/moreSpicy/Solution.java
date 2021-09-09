package programmers.moreSpicy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

  public int solution(int[] scoville, int k) {
    Queue<Integer> priorityQueue = pushArrayIntoPriorityQueue(scoville);
    return getMixCount(priorityQueue, k);
  }

  private int getMixCount(Queue<Integer> priorityQueue, int k) {
    int mixCount = 0;

    while (priorityQueue.element() <= k) {
      if (priorityQueue.size() == 1) {
        return -1;
      }
      int mix = priorityQueue.remove() + (priorityQueue.remove() * 2);
      priorityQueue.offer(mix);
      mixCount++;
    }
    return mixCount;
  }

  private Queue<Integer> pushArrayIntoPriorityQueue(int[] scoville) {
    Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());
    for (int i = 0; i < scoville.length; i++) {
      priorityQueue.add(scoville[i]);
    }
    return priorityQueue;
  }
}
