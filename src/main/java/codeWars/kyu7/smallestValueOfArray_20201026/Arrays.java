package codeWars.kyu7.smallestValueOfArray_20201026;

public class Arrays {

  public static int findSmallest(final int[] numbers, final String toReturn) {
    int minIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < numbers[minIndex]) {
        minIndex = i;
      }
    }
    return toReturn.equals("index") ? minIndex : numbers[minIndex];
  }
}
