package programmers.passingBridgeTruck;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public int solution(int bridgeLength, int bridgeWeight, int[] truckWeights) {
    Queue<Integer> truckQueue = getTruckQueue(truckWeights);
    int second = calculatePassingTimeExceptLastTruck(truckQueue, bridgeLength, bridgeWeight);
    return second + bridgeLength;
  }

  private int calculatePassingTimeExceptLastTruck(Queue<Integer> truckQueue, int bridgeLength,
      int weight) {
    Queue<Integer> bridgeQueue = new LinkedList<>();
    int weightOnBridge = 0;
    int second = 0;
    while (!truckQueue.isEmpty()) {
      if (bridgeQueue.size() == bridgeLength) {
        weightOnBridge -= bridgeQueue.remove();
      }
      if (weightOnBridge + truckQueue.element() <= weight && bridgeQueue.size() < bridgeLength) {
        weightOnBridge += truckQueue.element();
        bridgeQueue.add(truckQueue.remove());
      } else {
        bridgeQueue.add(0);
      }
      second++;
    }
    return second;
  }

  private Queue<Integer> getTruckQueue(int[] truckWeights) {
    Queue<Integer> truckQueue = new LinkedList<>();
    for (int truck : truckWeights) {
      truckQueue.add(truck);
    }
    return truckQueue;
  }
}
