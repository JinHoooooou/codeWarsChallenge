package programmers.level1.소수찾기_20201018;

public class Solution {

  public int solution(int n) {
    int primeCount = 0;
    for (int i = 2; i <= n; i++) {
      if (i != 2 && i % 2 == 0) {
        continue;
      }
      if (isPrime(i)) {
        primeCount++;
      }
    }
    return primeCount;
  }

  private boolean isPrime(int number) {
    for (int i = 2; i <= (int) Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
