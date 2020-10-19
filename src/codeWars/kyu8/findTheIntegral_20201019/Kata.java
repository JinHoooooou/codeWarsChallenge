package codeWars.kyu8.findTheIntegral_20201019;

public class Kata {

  public static String integrate(int coefficient, int exponent) {
    return coefficient / (exponent + 1) + "x^" + (exponent + 1);
  }
}
