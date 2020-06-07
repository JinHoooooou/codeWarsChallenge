package programmers.camouflage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public int solution(String[][] clothes) {
    Map<String, List<String>> clothesMap = new HashMap<>();

    for (int i = 0; i < clothes.length; i++) {
      String clothesType = clothes[i][1];
      String clothesName = clothes[i][0];
      List<String> clothesList = new ArrayList<>();
      if (clothesMap.containsKey(clothesType)) {
        clothesList = clothesMap.get(clothesType);
      }
      clothesList.add(clothesName);
      clothesMap.put(clothesType, clothesList);
    }
    int result = 1;
    for (Entry<String, List<String>> entry : clothesMap.entrySet()) {
      List<String> clothesList = entry.getValue();
      result = result * (clothesList.size() + 1);
    }
    return result - 1;
  }
}
