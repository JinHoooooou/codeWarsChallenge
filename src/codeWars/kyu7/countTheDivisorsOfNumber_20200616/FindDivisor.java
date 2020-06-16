package codeWars.kyu7.countTheDivisorsOfNumber_20200616;

public class FindDivisor {

  public long numberOfDivisors(int n) {
    int count = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    return n == 0 ? 0 : count + 1;
  }
}
