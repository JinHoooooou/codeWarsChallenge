package codeWars.kyu7.SortedYesNoHow_20200712;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  public static String isSortedAndHow(int[] array) {
    Integer[] unsorted = new Integer[array.length];
    Integer[] sorted = new Integer[array.length];
    for (int i = 0; i < sorted.length; i++) {
      unsorted[i] = array[i];
      sorted[i] = array[i];
    }
    Arrays.sort(sorted);
    if (Arrays.equals(unsorted, sorted)) {
      return "yes, ascending";
    }
    Arrays.sort(sorted, Comparator.reverseOrder());
    if (Arrays.equals(unsorted, sorted)) {
      return "yes, descending";
    }
    return "no";
  }
}
