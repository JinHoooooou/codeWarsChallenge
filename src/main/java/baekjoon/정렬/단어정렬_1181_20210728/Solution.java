package baekjoon.정렬.단어정렬_1181_20210728;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    int length = Integer.parseInt(READER.readLine());

    String[] words = new String[length];
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      words[i] = tokenizer.nextToken();
    }

    //selectionSort(words);
    //bubbleSort(words);
    //insertionSort(words);
    //mergeSort(words, 0, words.length - 1);
    //quickSort(words, 0, words.length - 1);

    for (String word : words) {
      WRITER.write(word + "\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static void quickSort(String[] words, int first, int last) {
    if (first < last) {
      int pivot = partition(words, first, last);
      quickSort(words, first, pivot - 1);
      quickSort(words, pivot + 1, last);
    }
  }

  private static int partition(String[] words, int first, int last) {
    int pivot = last;
    int i = first - 1;
    int j;
    for (j = first; j <= last; j++) {
      if (compare(words[j], words[pivot])) {
        swap(words, ++i, j);
      }
    }
    swap(words, i + 1, pivot);
    return i + 1;
  }

  private static void mergeSort(String[] array, int first, int last) {
    if (first < last) {
      int mid = (first + last) / 2;
      mergeSort(array, first, mid);
      mergeSort(array, mid + 1, last);
      merge(array, first, mid, last);
    }
  }

  private static void merge(String[] array, int first, int mid, int last) {
    String[] temp = new String[array.length];
    int i = first;
    int k = first;
    int j = mid + 1;

    while (i <= mid && j <= last) {
      if (compare(array[i], array[j])) {
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

    for (int l = first; l <= last; l++) {
      array[l] = temp[l];
    }
  }

  private static void insertionSort(String[] array) {
    for (int i = 1; i < array.length; i++) {
      String target = array[i];
      int j;
      for (j = i - 1; j >= 0 && compare(target, array[j]); j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = target;
    }
  }

  private static void bubbleSort(String[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (compare(array[j + 1], array[j])) {
          swap(array, j, j + 1);
        }
      }
    }
  }

  private static void selectionSort(String[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (compare(array[i], array[j])) {
          swap(array, i, j);
        }
      }
    }
  }

  private static void swap(String[] array, int a, int b) {
    String temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  private static boolean compare(String a, String b) {
    return a.length() == b.length() ? a.compareTo(b) < 0 : a.length() - b.length() < 0;
  }
}
