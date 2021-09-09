package baekjoon.정렬.수정렬하기_2750_20210507;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int n = Integer.parseInt(tokenizer.nextToken());
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      array[i] = Integer.parseInt(tokenizer.nextToken());
    }

    //selectionSort(array);
    //bubbleSort(array);
    //insertionSort(array);
    //mergeSort(array, 0, array.length - 1);
    //quickSort(array, 0, array.length - 1);
    heapSort(array);
    StringBuilder result = new StringBuilder();
    for (int value : array) {
      result.append(value + "\n");
    }
    WRITER.write(result.toString());

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void heapSort(int[] array) {
    int lastIndex = array.length - 1;
    for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
      heapify(array, i, lastIndex);
    }
    for (int i = lastIndex; i > 0; i--) {
      swap(array, 0, i);
      heapify(array, 0, i - 1);
    }
  }

  private static void heapify(int[] array, int targetIndex, int lastIndex) {
    int rightChildIndex = targetIndex * 2 + 2;
    int leftChildIndex = targetIndex * 2 + 1;

    int greaterIndex = targetIndex;
    if (leftChildIndex <= lastIndex && array[leftChildIndex] > array[greaterIndex]) {
      greaterIndex = leftChildIndex;
    }
    if (rightChildIndex <= lastIndex && array[rightChildIndex] > array[leftChildIndex]) {
      greaterIndex = rightChildIndex;
    }

    if (targetIndex != greaterIndex) {
      swap(array, targetIndex, greaterIndex);
      heapify(array, greaterIndex, lastIndex);
    }
  }

  private static void quickSort(int[] array, int first, int last) {
    if (first < last) {
      int pivotIndex = partition(array, first, last);
      quickSort(array, first, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, last);
    }
  }

  private static int partition(int[] array, int first, int last) {
    int pivotIndex = last;
    int i = first - 1;
    int j;
    for (j = first; j <= last; j++) {
      if (array[j] < array[pivotIndex]) {
        swap(array, ++i, j);
      }
    }
    swap(array, pivotIndex, i + 1);
    return i + 1;
  }

  private static void mergeSort(int[] array, int first, int last) {
    if (first < last) {
      int mid = (first + last) / 2;
      mergeSort(array, first, mid);
      mergeSort(array, mid + 1, last);
      merge(array, first, mid, last);
    }
  }

  private static void merge(int[] array, int first, int mid, int last) {
    int i = first;
    int j = mid + 1;
    int k = first;
    int[] temp = Arrays.copyOf(array, array.length);
    while (i <= mid && j <= last) {
      if (array[i] < array[j]) {
        temp[k++] = array[i++];
      } else {
        temp[k++] = array[j++];
      }
    }

    if (i > mid) {
      for (int l = j; l <= last; l++) {
        temp[k++] = array[l];
      }
    } else {
      for (int l = i; l <= mid; l++) {
        temp[k++] = array[l];
      }
    }

    for (i = 0; i < array.length; i++) {
      array[i] = temp[i];
    }

  }

  private static void insertionSort(int[] array) {
    int length = array.length;
    for (int i = 1; i < length; i++) {
      int target = array[i];
      int j;
      for (j = i - 1; j >= 0 && array[j] > target; j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = target;
    }
  }

  private static void bubbleSort(int[] array) {
    int length = array.length;

    for (int i = length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, i, j);
        }
      }
    }
  }

  private static void selectionSort(int[] array) {
    int length = array.length;

    for (int i = length - 1; i > 0; i--) {
      int maxIndex = i;
      for (int j = 0; j < i; j++) {
        if (array[j] > array[maxIndex]) {
          maxIndex = j;
        }
      }
      swap(array, maxIndex, i);
    }

  }

  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}
