package doNotSolve.codewars.kyu4.nextSmallerNumberWithTheSameDigits;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

  public static long nextSmaller(long n) {
    char[] digits = String.valueOf(n).toCharArray();
    int smallerValueIndex = 0;
    for (int i = digits.length - 1; i > 0; i--) {
      if (digits[i] < digits[i - 1]) {
        smallerValueIndex = i;
        break;
      }
    }
    if (smallerValueIndex == 0) {
      return -1L;
    }

    char swapTarget = digits[smallerValueIndex - 1];
    int indexOfBiggestDigitLessThanTarget = smallerValueIndex;
    for (int i = indexOfBiggestDigitLessThanTarget + 1; i < digits.length; i++) {
      if (digits[i] < swapTarget && digits[i] > digits[indexOfBiggestDigitLessThanTarget]) {
        indexOfBiggestDigitLessThanTarget = i;
      }
    }
    swap(digits, smallerValueIndex, indexOfBiggestDigitLessThanTarget);
    long result = descendingSort(digits, smallerValueIndex);

    return String.valueOf(result).length() == digits.length ? result : -1L;
  }

  private static long descendingSort(char[] digits, int smallerValueIndex) {
    String[] result = String.valueOf(digits).split("");
    Arrays.sort(result, smallerValueIndex, result.length, Comparator.reverseOrder());
    return Long.parseLong(String.join("", result));
  }

  private static void swap(char[] digits, int smallerValueIndex, int minDigitIndex) {
    char temp = digits[smallerValueIndex - 1];
    digits[smallerValueIndex - 1] = digits[minDigitIndex];
    digits[minDigitIndex] = temp;
  }
}
