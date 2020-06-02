package codeWars.consecutiveStrings_20200429;

import java.util.ArrayList;
import java.util.List;

public class LongestConsec {

  public static String longestConsec(String[] strarr, int k) {

    if (k > strarr.length || k <= 0) {
      return "";
    }
    List<String> consecutiveStringList = makeConsecutiveString(strarr, k);

    String result = consecutiveStringList.get(0);
    for (String consecutiveString : consecutiveStringList) {
      if (result.length() < consecutiveString.length()) {
        result = consecutiveString;
      }
    }
    return result;
  }

  private static List<String> makeConsecutiveString(String[] strarr, int k) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < strarr.length - k + 1; i++) {
      String element = "";
      for (int j = i; j < k + i; j++) {
        element += strarr[j];
      }
      list.add(i, element);
    }
    return list;
  }
}
