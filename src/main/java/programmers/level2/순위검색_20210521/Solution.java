package programmers.level2.순위검색_20210521;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public int[] solution(String[] info, String[] queries) {
    Map<String, List<Integer>> applicantsMap = initMap(info);

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < queries.length; i++) {
      int score = getScore(queries[i]);
      String query = concatData(queries[i]);

      result.add(countLargerThan(score, applicantsMap, query));
    }

    return result.stream().mapToInt(x -> x).toArray();
  }

  private Integer countLargerThan(int score, Map<String, List<Integer>> applicantsMap,
      String query) {
    if (!applicantsMap.containsKey(query)) {
      return 0;
    }

    List<Integer> list = applicantsMap.get(query);
    int startIndex = 0;
    int endIndex = list.size() - 1;
    while (startIndex <= endIndex) {
      int midIndex = (startIndex + endIndex) / 2;
      if (list.get(midIndex) < score) {
        startIndex = midIndex + 1;
      } else {
        endIndex = midIndex - 1;
      }
    }

    return list.size() - startIndex;
  }

  private String concatData(String query) {
    return query.replaceAll("and", "")
        .replaceAll(" +", "")
        .replaceAll("\\d", "");
  }

  private int getScore(String query) {
    String[] data = query.split(" ");
    return Integer.parseInt(data[data.length - 1]);
  }

  private Map<String, List<Integer>> initMap(String[] info) {
    Map<String, List<Integer>> map = new HashMap<>();
    for (String s : info) {
      dfs(map, s.split(" "), "", 0);
    }

    for (String key : map.keySet()) {
      map.get(key).sort(Comparator.naturalOrder());
    }
    return map;
  }

  private void dfs(Map<String, List<Integer>> map, String[] data, String current, int index) {
    if (index == 4) {
      List<Integer> list = map.getOrDefault(current, new ArrayList<>());
      list.add(Integer.parseInt(data[4]));
      map.put(current, list);
      return;
    }

    dfs(map, data, current + "-", index + 1);
    dfs(map, data, current + data[index], index + 1);
  }
}
