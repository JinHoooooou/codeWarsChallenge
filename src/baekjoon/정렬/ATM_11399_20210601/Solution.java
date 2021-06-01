package baekjoon.정렬.ATM_11399_20210601;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int[] array = getAtmTimes();
    //selectionSort(array);
    //bubbleSort(array);
    //insertionSort(array);
    //mergeSort(array, 0, array.length - 1);
    //quickSort(array, 0, array.length - 1);
    heapSort(array);

    for (int i = 1; i < array.length; i++) {
      array[i] += array[i - 1];
    }
    int sum = Arrays.stream(array).sum();

    WRITER.write(sum + "\n");
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

  private static void heapify(int[] array, int heapSize) {
    for (int i = 1; i < heapSize; i++) {
      int child = i;
      while (child > 0) {
        int parent = (child - 1) / 2;
        if (array[child] > array[parent]) {
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
    int i = first - 1;
    int j;
    int pivot = new Random().nextInt(last - first) + first;
    swap(array, pivot, last);
    pivot = last;

    for (j = first; j <= last; j++) {
      if (array[j] < array[pivot]) {
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

    int[] temp = new int[array.length];
    while (i <= mid && j <= last) {
      if (array[i] > array[j]) {
        temp[k++] = array[j++];
      } else {
        temp[k++] = array[i++];
      }
    }

    if (i <= mid) {
      for (int l = i; l <= mid; l++) {
        temp[k++] = array[l];
      }
    } else {
      for (int l = j; l <= last; l++) {
        temp[k++] = array[l];
      }
    }

    for (int l = first; l <= last; l++) {
      array[l] = temp[l];
    }
  }

  private static void insertionSort(int[] array) {

    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j;
      for (j = i - 1; j >= 0 && array[j] > temp; j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = temp;
    }
  }

  private static void bubbleSort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
  }

  private static void selectionSort(int[] array) {

    for (int i = array.length - 1; i > 0; i--) {
      int max = array[i];
      int maxIndex = i;
      for (int j = 0; j < i; j++) {
        if (array[j] > max) {
          max = array[j];
          maxIndex = j;
        }
      }
      swap(array, i, maxIndex);
    }
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  private static int[] getAtmTimes() throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    int[] array = new int[Integer.parseInt(tokenizer.nextToken())];
    tokenizer = new StringTokenizer(READER.readLine());
    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(tokenizer.nextToken());
    }
    return array;
  }
}
