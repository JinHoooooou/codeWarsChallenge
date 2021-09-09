package programmers.level2.점프와순간이동_20201119;

public class Solution {

  public int solution(int n) {
    long number = n;
    int jumpCount = 0;

    while (number > 0) {
      if (number % 2 == 1) {
        number--;
        jumpCount++;
      }
      number /= 2;
    }

    return jumpCount;
  }
}
