package theSupermarketQueue_20200529;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    Queue<Integer> queue = getCustomersQueue(customers);

    int[] tills = new int[n];
    int resultTime = 0;
    while (!queue.isEmpty()) {
      for (int i = 0; i < tills.length; i++) {
        if (tills[i] == 0 && !queue.isEmpty()) {
          tills[i] = queue.poll();
        }
      }
      int min = Arrays.stream(tills).min().getAsInt();
      tills = Arrays.stream(tills).map(x -> x - min).toArray();
      resultTime += min;
    }
    return resultTime + Arrays.stream(tills).max().getAsInt();
  }

  private static Queue<Integer> getCustomersQueue(int[] customers) {
    Queue<Integer> queue = new LinkedList<>();
    for (int customer : customers) {
      queue.add(customer);
    }
    return queue;
  }
}
