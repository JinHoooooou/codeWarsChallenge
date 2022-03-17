package codewars._7kyu.Double_Sort_20220317;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DoubleSort {

  public static Object[] dbSort(Object[] a) {
    List<Integer> numbers = new ArrayList<>();
    List<String> strings = new ArrayList<>();
    List<Object> result = new ArrayList<>();

    for (Object value : a) {
      if (value instanceof Integer) {
        numbers.add((Integer) value);
      } else {
        strings.add(String.valueOf(value));
      }
    }
    numbers.sort(Comparator.naturalOrder());
    strings.sort(Comparator.naturalOrder());
    result.addAll(numbers);
    result.addAll(strings);
    return result.stream().toArray(Object[]::new);
  }

  public static Object[] dbSortBestPractice(Object[] a) {
    return Stream.concat(Arrays.stream(a).filter(x -> x instanceof Integer).sorted(),
        Arrays.stream(a).filter(x -> x instanceof String).sorted()).toArray();
  }
}
