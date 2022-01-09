package programmers.level2.타겟넘버_20220109;

public class Solution {

  public int count;

  public int solution(int[] numbers, int target) {
    count = 0;
    dfs(numbers, 0, 0, target);
    return this.count;
  }

  private void dfs(int[] numbers, int currentValue, int currentIndex, int target) {
    if (currentIndex == numbers.length) {
      if (currentValue == target) {
        this.count++;
      }
      return;
    }
    dfs(numbers, currentValue + numbers[currentIndex], currentIndex + 1, target);
    dfs(numbers, currentValue - numbers[currentIndex], currentIndex + 1, target);

  }
}
