package programmers.level2.메뉴리뉴얼_20210516;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solution {

  private Map<String, Integer> map;

  public String[] solution(String[] orders, int[] course) {
    List<String> result = new ArrayList<>();
    for (int menuCount : course) {
      map = new HashMap<>();
      for (String order : orders) {
        makeCourseMenu(order, menuCount);
      }
      List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
      list.sort((o1, o2) -> o2.getValue() - o1.getValue());
      int max = list.isEmpty() ? 0 : list.get(0).getValue();
      for (Entry<String, Integer> entry : list) {
        if (max >= 2 && entry.getValue() == max) {
          result.add(entry.getKey());
        } else {
          break;
        }
      }
    }
    result.sort(Comparator.naturalOrder());
    return result.toArray(new String[0]);
  }

  private void makeCourseMenu(String order, int menuCount) {
    order = Arrays.stream(order.split("")).sorted().collect(Collectors.joining(""));
    dfs(order, 0, "", menuCount);
  }

  private void dfs(String order, int currentIndex, String current, int menuCount) {
    if (current.length() == menuCount) {
      map.put(current, map.getOrDefault(current, 0) + 1);
      return;
    }

    if (currentIndex < 0 || currentIndex >= order.length()) {
      return;
    }

    for (int i = currentIndex; i < order.length(); i++) {
      dfs(order, i + 1, current + order.charAt(i), menuCount);
    }
  }
}
