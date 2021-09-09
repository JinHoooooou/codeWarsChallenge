package codeWars.rangeExtraction_20200531;

public class Solution {

  public static String rangeExtraction(int[] arr) {
    StringBuilder result = new StringBuilder();
    for (int startIndex = 0; startIndex < arr.length; startIndex++) {
      result.append(arr[startIndex]);
      int endIndex = findEndIndex(arr, startIndex);
      int consecutiveNumberLength = endIndex - startIndex + 1;
      if (consecutiveNumberLength >= 3) {
        result.append("-").append(arr[endIndex]);
        startIndex = endIndex;
      }
      result.append(",");
    }
    return result.substring(0, result.length() - 1);
  }

  private static int findEndIndex(int[] arr, int startIndex) {
    int endIndex = startIndex;
    while (endIndex < arr.length - 1 && (arr[endIndex] + 1 == arr[endIndex + 1])) {
      endIndex++;
    }
    return endIndex;
  }
}
