package baekjoon.우선순위큐.최소힙_1927_20210603;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SolutionNotUseQueue {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int heapSize;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int count = Integer.parseInt(tokenizer.nextToken());
    int[] array = new int[100000];
    heapSize = 0;
    StringBuilder result = new StringBuilder();
    while (count-- > 0) {
      tokenizer = new StringTokenizer(READER.readLine());
      int number = Integer.parseInt(tokenizer.nextToken());
      if (number == 0) {
        int min = extractMin(array);
        result.append(min + "\n");
      } else {
        insert(array, number);
      }
    }
    WRITER.write(result.toString());
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void insert(int[] array, int number) {
    array[heapSize++] = number;
    minHeapify(array);
  }

  private static int extractMin(int[] array) {
    if (heapSize == 0) {
      return 0;
    }
    int min = array[0];
    array[0] = array[heapSize - 1];
    array[heapSize - 1] = 0;
    heapSize--;
    minHeapify(array);

    return min;
  }

  private static void minHeapify(int[] array) {
    for (int i = 1; i < heapSize; i++) {
      int child = i;
      while (child > 0) {
        int parent = (child - 1) / 2;
        if (array[child] < array[parent]) {
          swap(array, child, parent);
        }
        child = parent;
      }
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
