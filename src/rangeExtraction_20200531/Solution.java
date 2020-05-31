package rangeExtraction_20200531;

public class Solution {

  public static String rangeExtraction(int[] arr) {
    String result = "";
    for (int i = 0; i < arr.length; i++) {
      int j = i + 1;
      while (j < arr.length) {
        if (arr[j - 1] + 1 == arr[j]) {
          j++;
        } else {
          break;
        }
      }
      if (j - i > 2) {
        result += arr[i] + "-" + arr[j - 1] + ",";
        i = j - 1;
      } else if (j - i == 2) {
        result += arr[i] + "," + arr[j - 1] + ",";
        i = j - 1;
      } else {
        result += arr[i] + ",";
      }
    }
    return result.substring(0, result.length() - 1);
  }
}
