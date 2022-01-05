package baekjoon.정렬.소트인사이드_1427_20210617;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    String number = tokenizer.nextToken();
    int[] array = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();

    //selectionSort(array);
    //bubbleSort(array);
    //insertionSort(array);
    //mergeSort(array, 0, array.length - 1);
    //quickSort(array, 0, array.length - 1);
    heapSort(array);

    String reversedSortNumber = Arrays.stream(array).mapToObj(String::valueOf)
        .collect(Collectors.joining(""));

    WRITER.write(reversedSortNumber);
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void heapSort(int[] array) {
    heapify(array, array.length);

    for (int i = array.length - 1; i > 0; i--) {
      swap(array, 0, i);
      heapify(array, i);
    }
  }

  private static void heapify(int[] array, int number) {
    for (int i = 1; i < number; i++) {
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

  private static void quickSort(int[] array, int first, int last) {
    if (first < last) {
      int pivot = partition(array, first, last);
      quickSort(array, first, pivot - 1);
      quickSort(array, pivot + 1, last);
    }
  }

  private static int partition(int[] array, int first, int last) {
    int pivot = last;
    int i = first - 1;
    int j;
    for (j = first; j <= last; j++) {
      if (array[j] > array[pivot]) {
        swap(array, ++i, j);
      }
    }
    swap(array, i + 1, pivot);

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
    int[] copy = new int[array.length];

    while (i <= mid && j <= last) {
      if (array[i] > array[j]) {
        copy[k++] = array[i++];
      } else {
        copy[k++] = array[j++];
      }
    }

    if (i <= mid) {
      for (int l = i; l <= mid; l++) {
        copy[k++] = array[l];
      }
    } else {
      for (int l = j; j <= last; l++) {
        copy[k++] = array[l];
      }
    }

    for (int l = first; l <= last; l++) {
      array[l] = copy[l];
    }
  }

  private static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int target = array[i];
      int j;
      for (j = i - 1; j >= 0 && array[j] < target; j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = target;
    }
  }

  private static void bubbleSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] < array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
  }

  private static void selectionSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      int minIndex = i;
      int j;
      for (j = 0; j <= i; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      swap(array, minIndex, i);
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
