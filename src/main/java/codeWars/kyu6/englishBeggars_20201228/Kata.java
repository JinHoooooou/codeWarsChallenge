package codeWars.kyu6.englishBeggars_20201228;

public class Kata {

  public static int[] beggars(int[] values, int n) {
    boolean[] visit = new boolean[values.length];
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = i; j < values.length; j += n) {
        if (!visit[j]) {
          visit[j] = true;
          result[i] += values[j];
        }
      }
    }

    return result;
  }
}
