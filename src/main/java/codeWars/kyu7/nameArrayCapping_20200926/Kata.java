package codeWars.kyu7.nameArrayCapping_20200926;

import java.util.Arrays;

public class Kata {

  public static String[] capMe(String[] strings) {
    return Arrays.stream(strings)
        .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
        .toArray(String[]::new);
  }
}
