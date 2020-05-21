package weightForWeight_20200521;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

  public static String orderWeight(String string) {
    Map<Integer, ArrayList<String>> map = getWeightMap(string);
    return String.join(" ", map.values());
  }

  private static Map<Integer, ArrayList<String>> getWeightMap(String string) {
    Map<Integer, ArrayList<String>> map = new TreeMap<>();
    for (String weight : string.split(" ")) {
      ArrayList<String> valueList = new ArrayList<>();
      int key = getWeightPoint(weight);
      if (map.containsKey(key)) {
        valueList = map.get(key);
      }
      valueList.add(weight);
      map.put(key, valueList);
    }
    return map;
  }

  private static int getWeightPoint(String weight) {
    int weightPoint = 0;
    for (Character c : weight.toCharArray()) {
      weightPoint += Character.getNumericValue(c);
    }
    return weightPoint;
  }
}
