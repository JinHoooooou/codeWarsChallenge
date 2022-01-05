package programmers.camouflage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnotherSolution {

  public int solution(String[][] clothes) {
    Map<String, Integer> clothesMap = new HashMap<>();

    for (int i = 0; i < clothes.length; i++) {
      String clothesType = clothes[i][1];
      clothesMap.put(clothesType, clothesMap.getOrDefault(clothesType, 0) + 1);
    }
    int result = 1;
    for (Entry<String, Integer> entry : clothesMap.entrySet()) {
      result = result * (entry.getValue() + 1);
    }
    return result - 1;
  }
}
