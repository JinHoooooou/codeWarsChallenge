package findTheStrayNumber_20200524;

import java.util.Arrays;

public class Solution {

  public static int stray(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
  }
}
