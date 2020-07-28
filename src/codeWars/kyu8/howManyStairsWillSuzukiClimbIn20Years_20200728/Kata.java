package codeWars.kyu8.howManyStairsWillSuzukiClimbIn20Years_20200728;

import java.util.Arrays;

public class Kata {

  public static long stairsIn20(int[][] stairs) {
    long result = 0;
    for (int i = 0; i < stairs.length; i++) {
      result += Arrays.stream(stairs[i]).sum();
    }
    return result * 20;
  }
}
