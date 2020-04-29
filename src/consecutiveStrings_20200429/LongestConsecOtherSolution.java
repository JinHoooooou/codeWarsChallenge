package consecutiveStrings_20200429;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestConsecOtherSolution {

  public static String longestConsec(String[] strarr, int k) {
    if (strarr.length == 0 || k > strarr.length || k <= 0) {
      return "";
    }

    String longestStr = "";
    for (int index = 0; index < strarr.length - k + 1; index++) {
      StringBuilder sb = new StringBuilder();
      for (int i = index; i < index + k; i++) {
        sb.append(strarr[i]);
      }
      if (sb.toString().length() > longestStr.length()) {
        longestStr = sb.toString();
      }
    }
    return longestStr;
  }

  public static String anotherSolution(String[] strarr, int k) {
    String maxString = "";
    for (int i = 0; i < strarr.length - k + 1; i++) {
      String current = IntStream.range(i, k + i).mapToObj(x -> strarr[x])
          .collect(Collectors.joining());
      if (current.length() > maxString.length()) {
        maxString = current;
      }
    }
    return maxString;
  }


}
