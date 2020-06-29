package codeWars.kyu5.pickPeaks_20200629;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

  public static Map<String, List<Integer>> getPeaks(int[] arr) {

    Map<String, List<Integer>> result = new HashMap<>();
    List<Integer> posList = new ArrayList<>();
    List<Integer> peakList = new ArrayList<>();
    int startIndex = 0;
    while (startIndex < arr.length) {
      int endIndex = getEndIndex(arr, startIndex);
      if (endIndex == -1) {
        startIndex++;
        continue;
      }

      int maxIndex = getMaxIndex(arr, startIndex, endIndex);
      if (maxIndex != startIndex) {
        posList.add(maxIndex);
        peakList.add(arr[maxIndex]);
      }
      startIndex = endIndex;
    }

    result.put("pos", posList);
    result.put("peaks", peakList);
    return result;
  }

  private static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
    int maxIndex = startIndex;
    for (int i = startIndex; i < endIndex; i++) {
      if (arr[i] > arr[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  private static int getEndIndex(int[] arr, int startIndex) {
    for (int endIndex = startIndex + 1; endIndex < arr.length; endIndex++) {
      if (arr[endIndex - 1] > arr[endIndex]) {
        return endIndex;
      }
    }
    return -1;
  }
}
