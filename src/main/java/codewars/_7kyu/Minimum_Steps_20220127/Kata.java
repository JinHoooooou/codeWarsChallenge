package codewars._7kyu.Minimum_Steps_20220127;

import java.util.Arrays;

public class Kata {

  public static int minimumSteps(int[] numbers, int k) {
    Arrays.sort(numbers);
    int sum = 0;
    int index = 0;
    while (sum < k) {
      sum += numbers[index++];
    }
    return index - 1;
  }
}
