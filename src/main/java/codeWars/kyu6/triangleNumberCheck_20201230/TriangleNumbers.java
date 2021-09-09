package codeWars.kyu6.triangleNumberCheck_20201230;

public class TriangleNumbers {

  public static boolean isTriangleNumber(long number) {
    return Math.sqrt(1 + 8 * number) == Math.round(Math.sqrt(1 + 8 * number));
  }
}
