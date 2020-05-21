package weightForWeight_20200521;

import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

  public static String orderWeight(String string) {
    String[] weightList = string.split(" ");
    Map<Integer, String> map = new TreeMap<>();

    for (String weight : weightList) {
      int key = 0;
      for (Character c : weight.toCharArray()) {
        key += Character.getNumericValue(c);
      }
      if (!map.containsKey(key)) {
        map.put(key, weight);
      } else {
        map.put(key, map.get(key) + " " + weight);
      }
    }
    String result = "";
    for (Integer key : map.keySet()) {
      result += map.get(key) + " ";
    }
    return result.trim();
  }
}
