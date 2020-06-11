package codeWars.kyu7;

import java.util.Arrays;

public class CountDig {

  public static int nbDig(int n, int d) {
    int count = 0;
    for (long i = 0; i <= n; i++) {
      String[] digits = String.valueOf(i * i).split("");
      count += Arrays.stream(digits).filter(x -> x.equals(String.valueOf(d))).count();
    }
    return count;
  }
}
