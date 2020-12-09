package programmers.level2.소수만들기_20201209;

public class Solution {

  int primeCount = 0;

  public int solution(int[] nums) {

    dfs(nums, 0, 0, 0);
    return primeCount;
  }

  private void dfs(int[] nums, int current, int index, int count) {
    if (count == 3) {
      if (isPrime(current)) {
        primeCount++;
      }
      return;
    }

    for (int i = index; i < nums.length; i++) {
      dfs(nums, current + nums[i], i + 1, count + 1);
    }
  }

  private boolean isPrime(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
