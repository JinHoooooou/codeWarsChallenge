package codewars._6kyu.Split_and_then_add_both_sides_of_an_array_together_20220125;

import java.util.Arrays;

public class Kata {

  public static int[] splitAndAdd(int[] numbers, int n) {
    if (n == 0) {
      return numbers;
    }
    int size = (int) Math.floor(numbers.length / 2.0);
    int[] leftSides = Arrays.copyOfRange(numbers, 0, size);
    int[] rightSides = Arrays.copyOfRange(numbers, size, numbers.length);
    int[] result = new int[rightSides.length];

    if (rightSides.length > leftSides.length) {
      result[0] = rightSides[0];
      for (int i = 1; i < rightSides.length; i++) {
        result[i] = leftSides[i - 1] + rightSides[i];
      }
    } else {
      for (int i = 0; i < leftSides.length; i++) {
        result[i] = leftSides[i] + rightSides[i];
      }
    }

    return splitAndAdd(result, n - 1);
  }

  public static int[] splitAndAddBestPractice(int[] numbers, int n) {
    if (n == 0 || numbers.length == 1) {
      return numbers;
    }
    int[] result = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

    for (int i = 0; i < numbers.length / 2; i++) {
      result[i + numbers.length % 2] += numbers[i];
    }

    return splitAndAdd(result, n - 1);
  }
}
