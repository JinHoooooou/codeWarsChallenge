package baekjoon.우선순위큐.가운데를말해요_1655_20210729;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);

    int count = Integer.parseInt(READER.readLine());
    for (int i = 0; i < count; i++) {
      int value = Integer.parseInt(READER.readLine());
      if (maxHeap.size() == minHeap.size()) {
        maxHeap.add(value);
      } else {
        minHeap.add(value);
      }

      if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
        if (minHeap.peek() < maxHeap.peek()) {
          int temp = minHeap.poll();
          minHeap.add(maxHeap.poll());
          maxHeap.add(temp);
        }
      }

      WRITER.write(maxHeap.peek() + "\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
