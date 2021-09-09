package codeWars.invertValues_20200506;

import java.util.Arrays;

public class Kata {

  public static int[] invert(int[] array) {
    return Arrays.stream(array).map(i -> i * -1).toArray();
  }
}
