package baekjoon.정렬.나이순정렬_10814_20211018;

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

  public static void main(String[] args) throws IOException {
    StringTokenizer tokenizer = new StringTokenizer(READER.readLine());
    int count = Integer.parseInt(tokenizer.nextToken());
    String[] customers = new String[count];
    for (int i = 0; i < count; i++) {
      customers[i] = READER.readLine();
    }

    // selectionSort(customers);
    // bubbleSort(customers);
    // insertionSort(customers);
    // mergeSort(customers, 0, customers.length - 1);

    for (int i = 0; i < count; i++) {
      WRITER.write(customers[i] + "\n");
    }

    WRITER.flush();
    WRITER.close();
    READER.close();
  }


  private static void mergeSort(String[] customers, int first, int last) {
    if (first < last) {
      int mid = (first + last) / 2;
      mergeSort(customers, first, mid);
      mergeSort(customers, mid + 1, last);
      merge(customers, first, mid, last);
    }
  }

  private static void merge(String[] customers, int first, int mid, int last) {
    int i = first, j = mid + 1, k = first;
    String[] copys = new String[customers.length];
    while (i <= mid && j <= last) {
      if (getAge(customers[i]) > getAge(customers[j])) {
        copys[k++] = customers[j++];
      } else {
        copys[k++] = customers[i++];
      }
    }

    if (i > mid) {
      for (int l = j; l <= last; l++) {
        copys[k++] = customers[l];
      }
    } else {
      for (int l = i; l <= mid; l++) {
        copys[k++] = customers[l];
      }
    }

    for (int l = first; l <= last; l++) {
      customers[l] = copys[l];
    }
  }

  private static void insertionSort(String[] customers) {
    for (int i = 1; i < customers.length; i++) {
      String target = customers[i];
      int j;
      for (j = i - 1; j >= 0 && getAge(customers[j]) > getAge(target); j--) {
        customers[j + 1] = customers[j];
      }
      customers[j + 1] = target;
    }
  }

  private static void bubbleSort(String[] customers) {
    for (int i = customers.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (getAge(customers[j]) > getAge(customers[j + 1])) {
          swap(customers, j, j + 1);
        }
      }
    }
  }

  private static void selectionSort(String[] customers) {
    for (int i = customers.length - 1; i > 0; i--) {
      int maxIndex = i;
      int j;
      for (j = 0; j < i; j++) {
        if (getAge(customers[j]) > getAge(customers[maxIndex])) {
          maxIndex = j;
        }
      }
      swap(customers, maxIndex, j);
    }
  }

  private static void swap(String[] array, int i, int j) {
    String temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  private static int getAge(String ageAndName) {
    return Integer.parseInt(ageAndName.substring(0, ageAndName.indexOf(" ")));
  }
}
