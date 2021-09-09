package codeWars.countTheMonkeys_20200505;

import java.util.stream.IntStream;

public class MonkeyCounter {

  public static int[] monkeyCount(final int n) {
    return IntStream.range(1, n + 1).toArray();
  }
}
