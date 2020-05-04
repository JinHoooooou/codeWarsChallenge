package sortTheOdd_20200504;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

  public static int[] sortArray(int[] array) {

    if (array == null || array.length == 0) {
      return new int[]{};
    }
    List<Integer> oddSortedList = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        oddSortedList.add(array[i]);
      }
    }
    oddSortedList = oddSortedList.stream().sorted().collect(Collectors.toList());
    int oddSortedListIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        array[i] = oddSortedList.get(oddSortedListIndex);
        oddSortedListIndex++;
      }
    }

    return array;
  }
}
