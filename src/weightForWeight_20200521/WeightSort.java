package weightForWeight_20200521;

import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

  public static String orderWeight(String string) {
    Map<Integer, String> map = getWeightMap(string);
    return getResultString(map);
  }

  private static String getResultString(Map<Integer, String> map) {
    String resultString = "";
    for (Integer key : map.keySet()) {
      resultString += map.get(key) + " ";
    }
    return resultString.trim();
  }

  private static Map<Integer, String> getWeightMap(String string) {
    Map<Integer, String> map = new TreeMap<>();
    for (String weight : string.split(" ")) {
      int key = getWeightPoint(weight);
      map.put(key, weight);
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
