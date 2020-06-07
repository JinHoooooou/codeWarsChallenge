package programmers.stringZip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public int solution(String s) {

    int resultLength = s.length();
    for (int splitLength = 1; splitLength <= s.length() / 2; splitLength++) {
      List<String> splitStringList = getSplitStringList(s, splitLength);
      String resultString = getResultString(splitStringList);
      resultLength = Math.min(resultLength, resultString.length());
    }
    return resultLength;
  }

  private String getResultString(List<String> list) {
    List<String> resultList = new ArrayList<>();
    while (list.size() != 0) {
      String result = "";
      result += list.remove(0);
      int count = 1;
      while (list.size() != 0 && list.get(0).equals(result)) {
        list.remove(0);
        count++;
      }
      result = count == 1 ? result : count + result;
      resultList.add(result);
    }
    return resultList.stream().collect(Collectors.joining(""));
  }

  private List<String> getSplitStringList(String s, int stringLength) {
    List<String> list = new ArrayList<>();
    String split = s;
    while (split.length() > stringLength) {
      list.add(split.substring(0, stringLength));
      split = split.substring(stringLength);
    }
    if (split.length() != 0) {
      list.add(split);
    }
    return list;
  }
}
