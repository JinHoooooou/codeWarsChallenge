package codeWars.kyu7.findCountOfMostFrequentItemInArray_20201112;

import java.util.HashMap;
import java.util.Map;

public class KataAnotherSolution {

  public static int mostFrequentItemCount(int[] collection) {
    if (collection.length == 0) {
      return 0;
    }
    Map<Integer, Integer> itemCount = new HashMap<>();
    for (int i = 0; i < collection.length; i++) {
      itemCount.put(collection[i], itemCount.getOrDefault(collection[i], 0) + 1);
    }
    return itemCount.values().stream().max(Integer::compareTo).get();
  }
}
