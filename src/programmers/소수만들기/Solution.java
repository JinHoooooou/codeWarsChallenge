package programmers.소수만들기;

public class Solution {

  int primeCount = 0;

  public int solution(int[] nums) {

    dfs(nums, 0, 0, 0);
    return primeCount;
  }

  private void dfs(int[] nums, int accumulate, int index, int count) {
    if (count == 3) {
      if (isPrime(accumulate)) {
        primeCount++;
      }
      return;
    }
    if (index > nums.length - 1) {
      return;
    }
    for (int i = index; i < nums.length; i++) {
      dfs(nums, accumulate + nums[i], i + 1, count + 1);
    }
  }

  private boolean isPrime(int accumulate) {
    for (int i = 2; i <= Math.sqrt(accumulate); i++) {
      if (accumulate % i == 0) {
        return false;
      }
    }
    return true;
  }
}
