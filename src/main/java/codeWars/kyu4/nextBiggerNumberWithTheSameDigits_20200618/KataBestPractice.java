package codeWars.kyu4.nextBiggerNumberWithTheSameDigits_20200618;

import java.util.Arrays;

public class KataBestPractice {

  public static long nextBiggerNumber(long n) {
    char[] toCharArray = String.valueOf(n).toCharArray();
    for (int i = toCharArray.length - 2; i >= 0; i--) {
      for (int j = toCharArray.length - 1; j > i; j--) {
        if (toCharArray[j] > toCharArray[i]) {
          char temp = toCharArray[i];
          toCharArray[i] = toCharArray[j];
          toCharArray[j] = temp;
          Arrays.sort(toCharArray, i + 1, toCharArray.length);
          return Long.parseLong(String.valueOf(toCharArray));
        }
      }
    }
    return -1;
  }
}
