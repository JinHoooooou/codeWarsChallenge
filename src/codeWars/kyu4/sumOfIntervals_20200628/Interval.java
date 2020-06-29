package codeWars.kyu4.sumOfIntervals_20200628;

import java.util.HashSet;
import java.util.Set;

public class Interval {

  public static int sumIntervals(int[][] intervals) {
    if (intervals == null) {
      return 0;
    }
    Set<Integer> intervalSet = new HashSet<>();
    for (int i = 0; i < intervals.length; i++) {
      for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
        intervalSet.add(j);
      }
    }
    return intervalSet.size();
  }
}
