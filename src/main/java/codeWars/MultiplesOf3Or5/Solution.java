package codeWars.MultiplesOf3Or5;

public class Solution {

  public static int solution(int number) {
    int sum = 0;
    for (int target = 0; target < number; target++) {
      if (target % 3 == 0 || target % 5 == 0) {
        sum += target;
      }
    }
    return sum;
  }
}
