package codeWars.deleteOccurrencesOfElement_20200502;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if (elements.length == 0) {
      return new int[]{};
    }
    Map<Integer, Integer> valueCount = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < elements.length; i++) {
      valueCount.put(elements[i], 0);
    }

    for (int i = 0; i < elements.length; i++) {
      if (valueCount.get(elements[i]) < maxOccurrences) {
        result.add(elements[i]);
        valueCount.put(elements[i], valueCount.get(elements[i]) + 1);
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}
