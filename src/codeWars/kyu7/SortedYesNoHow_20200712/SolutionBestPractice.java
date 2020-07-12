package codeWars.kyu7.SortedYesNoHow_20200712;

import java.util.stream.IntStream;

public class SolutionBestPractice {

  public static final String ASCENDING = "yes, ascending";
  public static final String DESCENDING = "yes, descending";
  public static final String NO = "no";

  public static String isSortedAndHow(int[] array) {
    if (IntStream.range(0, array.length - 1).allMatch(x -> array[x] <= array[x + 1])) {
      return ASCENDING;
    }
    if (IntStream.range(0, array.length - 1).allMatch(x -> array[x] >= array[x + 1])) {
      return DESCENDING;
    }
    return NO;
  }
}
