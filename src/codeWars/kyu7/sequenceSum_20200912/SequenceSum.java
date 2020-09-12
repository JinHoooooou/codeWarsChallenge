package codeWars.kyu7.sequenceSum_20200912;

public class SequenceSum {

  public static int[] sumOfN(int n) {
    int[] result = new int[Math.abs(n) + 1];
    for (int i = 1; i <= Math.abs(n); i++) {
      result[i] = result[i - 1] + (n > 0 ? i : -i);
    }
    return result;

  }
}