package sortTheOdd_20200504;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KataBestPractice {

  public static int[] sortArray(int[] array) {

    int[] oddSortedArray = IntStream.of(array).filter(x -> x % 2 == 1).toArray();
    for (int i = 0, oddSortedArrayIndex = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        array[i] = oddSortedArray[oddSortedArrayIndex++];
      }
    }

    return array;
  }
}
