package codeWars.kyu5.pickPeaks_20200629;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaksBestPractice {

  public static Map<String, List<Integer>> getPeaks(int[] arr) {
    Map<String, List<Integer>> result = new HashMap<>();
    List<Integer> posList = new ArrayList<>();
    List<Integer> peaksList = new ArrayList<>();

    boolean isAscending = false;
    int maxPosition = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        isAscending = true;
        maxPosition = i;
      }
      if (isAscending && arr[i - 1] > arr[i]) {
        isAscending = false;
        posList.add(maxPosition);
        peaksList.add(arr[maxPosition]);
      }
    }
    result.put("pos", posList);
    result.put("peaks", peaksList);
    return result;
  }
}
