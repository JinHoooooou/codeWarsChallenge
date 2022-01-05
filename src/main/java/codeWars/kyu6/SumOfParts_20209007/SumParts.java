package codeWars.kyu6.SumOfParts_20209007;

public class SumParts {

  public static int[] sumParts(int[] ls) {
    int[] result = new int[ls.length + 1];
    for (int i = ls.length - 1; i >= 0; i--) {
      result[i] = result[i + 1] + ls[i];
    }
    return result;
  }
}
