package codewars._6kyu.Pair_of_gloves_20220216;

import java.util.HashMap;
import java.util.Map;

public class Kata {

  public static int numberOfPairs(String[] gloves) {
    Map<String, Integer> gloveColorMap = getGloveColorMap(gloves);

    int result = 0;
    for (int eachColorCount : gloveColorMap.values()) {
      result += (eachColorCount / 2);
    }

    return result;
  }

  private static Map<String, Integer> getGloveColorMap(String[] gloves) {
    Map<String, Integer> gloveColorMap = new HashMap<>();

    for (String glove : gloves) {
      gloveColorMap.put(glove, gloveColorMap.getOrDefault(glove, 0) + 1);
    }
    return gloveColorMap;
  }
}
