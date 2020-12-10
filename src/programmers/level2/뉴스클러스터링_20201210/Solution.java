package programmers.level2.뉴스클러스터링_20201210;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  int union = 0;
  int intersection = 0;

  public int solution(String str1, String str2) {
    Map<String, Integer> map1 = getStringSet(str1);
    Map<String, Integer> map2 = getStringSet(str2);

    return getSimilarity(map1, map2);
  }

  private int getSimilarity(Map<String, Integer> map1, Map<String, Integer> map2) {
    for (Entry<String, Integer> entry : map1.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      if (map2.containsKey(key)) {
        intersection += Math.min(value, map2.get(key));
        union += Math.max(value, map2.get(key));
        map2.remove(key);
      } else {
        union += value;
      }
    }
    for (Entry<String, Integer> entry : map2.entrySet()) {
      union += entry.getValue();
    }

    return union == 0 ? 65536 : (int) Math.floor(65536 * ((double) intersection / union));
  }

  private Map<String, Integer> getStringSet(String string) {
    string = string.toLowerCase();
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < string.length() - 1; i++) {
      String sub = string.substring(i, i + 2);
      if (sub.matches("[a-z][a-z]")) {
        map.put(sub, map.getOrDefault(sub, 0) + 1);
      }
    }
    return map;
  }
}
