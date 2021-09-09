package codeWars.kyu7.sumOfTriangularNumbers_20200831;

public class Kata {

  public static int sumTriangularNumbers(int n) {
    int result = 0;
    int target = 0;
    for (int i = 1; i <= n; i++) {
      target += i;
      result += target;
    }
    return result;
  }
}
