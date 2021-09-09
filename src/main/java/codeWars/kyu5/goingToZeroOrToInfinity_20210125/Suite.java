package codeWars.kyu5.goingToZeroOrToInfinity_20210125;

public class Suite {

  public static double going(int n) {
    double result = 1.0;
    double frac = 1.0;
    while (n > 1) {
      frac /= n--;
      result += frac;
    }
    return (int) (result * 1e6) / 1e6;
  }
}
