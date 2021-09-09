package programmers.level2.타겟넘버_20210320;

public class Solution {

  private int targetCount = 0;

  public int solution(int[] numbers, int target) {

    dfs(numbers, target, 0, 0);

    return targetCount;
  }

  private void dfs(int[] numbers, int target, int sum, int index) {

    if (index == numbers.length) {
      if (target == sum) {
        targetCount++;
      }
      return;
    }

    dfs(numbers, target, sum + numbers[index], index + 1);
    dfs(numbers, target, sum - numbers[index], index + 1);
  }
}
