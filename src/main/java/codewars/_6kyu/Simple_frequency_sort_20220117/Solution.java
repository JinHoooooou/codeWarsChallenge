package codewars._6kyu.Simple_frequency_sort_20220117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

  public static int[] sortByFrequency(int[] array) {
    Map<Integer, Integer> countingMap = getCountingMap(array);
    List<Entry<Integer, Integer>> entryList = getSortedEntryList(countingMap);
    List<Integer> result = getListSortedByFrequency(entryList);

    return result.stream().mapToInt(x -> x).toArray();
  }

  private static Map<Integer, Integer> getCountingMap(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int target : array) {
      map.put(target, map.getOrDefault(target, 0) + 1);
    }
    return map;
  }

  private static List<Entry<Integer, Integer>> getSortedEntryList(
      Map<Integer, Integer> countingMap) {
    List<Entry<Integer, Integer>> entryList = new ArrayList<>(countingMap.entrySet());
    entryList.sort((o1, o2) -> {
      if (o1.getValue().equals(o2.getValue())) {
        return o1.getKey() - o2.getKey();
      }
      return o2.getValue() - o1.getValue();
    });
    return entryList;
  }

  private static List<Integer> getListSortedByFrequency(List<Entry<Integer, Integer>> entryList) {
    List<Integer> result = new ArrayList<>();
    for (Entry<Integer, Integer> entry : entryList) {
      int key = entry.getKey();
      int value = entry.getValue();
      for (int i = 0; i < value; i++) {
        result.add(key);
      }
    }
    return result;
  }

  public int[] sortByFrequencyBestPracticeSolution(int[] array) {
    Map<Integer, Long> integerCountMap =
        Arrays.stream(array)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return Arrays
        .stream(array)
        .boxed()
        .sorted(Comparator.<Integer, Long>comparing(integerCountMap::get)
            .reversed()
            .thenComparing(Comparator.naturalOrder()))
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
