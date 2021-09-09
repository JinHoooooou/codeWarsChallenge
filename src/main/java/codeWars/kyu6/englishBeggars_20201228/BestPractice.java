package codeWars.kyu6.englishBeggars_20201228;

public class BestPractice {

  public static int[] beggars(int[] values, int n) {
    if (n == 0) {
      return new int[0];
    }

    int[] result = new int[n];
    for (int i = 0; i < values.length; i++) {
      result[i % n] += values[i];
    }

    return result;
  }
}
