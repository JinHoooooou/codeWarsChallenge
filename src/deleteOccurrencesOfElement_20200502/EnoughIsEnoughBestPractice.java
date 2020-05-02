package deleteOccurrencesOfElement_20200502;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnoughBestPractice {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if (elements.length == 0) {
      return new int[]{};
    }
    Map<Integer, Integer> valueCount = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for (Integer element : elements) {
      Integer target = valueCount.put(element, valueCount.getOrDefault(element, 0) + 1);
      if (target == null || target < maxOccurrences) {
        result.add(target);
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }
}
