package programmers.targetNumber;

public class Solution {

  int count = 0;

  public int solution(int[] numbers, int target) {
    dfs(numbers, target, 0, 0);
    return count;
  }

  private void dfs(int[] numbers, int target, int sum, int index) {
    if (index == numbers.length) {
      count = sum == target ? count + 1 : count;
      return;
    }

    dfs(numbers, target, sum + numbers[index], index + 1);
    dfs(numbers, target, sum - numbers[index], index + 1);

  }
}
