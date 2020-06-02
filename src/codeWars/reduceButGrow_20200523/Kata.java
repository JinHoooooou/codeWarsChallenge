package codeWars.reduceButGrow_20200523;

import java.util.stream.IntStream;

public class Kata {

  public static int grow(int[] x) {
    return IntStream.of(x).reduce((a, b) -> a *= b).getAsInt();
  }
}
