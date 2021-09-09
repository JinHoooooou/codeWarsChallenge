package codeWars.theHighestProfitWins_20200511;

import java.util.stream.IntStream;

public class MinMax {

  public static int[] minMax(int[] arr) {

    return new int[]{IntStream.of(arr).min().getAsInt(), IntStream.of(arr).max().getAsInt()};
  }
}
