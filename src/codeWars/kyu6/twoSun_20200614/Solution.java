package codeWars.kyu6.twoSun_20200614;

public class Solution {

  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target && j != i) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
