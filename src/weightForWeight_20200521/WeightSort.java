package weightForWeight_20200521;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

  public static String orderWeight(String string) {
    Map<Integer, String> map = getSortedWeightMap(string);
    return String.join(" ", map.values());
  }

  private static Map<Integer, String> getSortedWeightMap(String string) {
    Map<Integer, String> map = new TreeMap<>();
    String[] weightList = string.split(" ");
    Arrays.sort(weightList);
    for (String weight : weightList) {
      int key = weight.chars().map(Character::getNumericValue).sum();
      if (map.containsKey(key)) {
        weight = map.get(key) + " " + weight;
      }
      map.put(key, weight);
    }
    return map;
  }
}
