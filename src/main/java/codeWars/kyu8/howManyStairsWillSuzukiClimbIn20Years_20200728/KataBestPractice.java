package codeWars.kyu8.howManyStairsWillSuzukiClimbIn20Years_20200728;

import java.util.Arrays;

public class KataBestPractice {

  public static long stairsIn20(int[][] stairs) {
    return 20 * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
  }
}
