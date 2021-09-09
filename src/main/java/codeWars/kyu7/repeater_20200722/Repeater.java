package codeWars.kyu7.repeater_20200722;

import java.util.Arrays;

public class Repeater {

  public static String repeat(String string, long n) {
    String[] result = new String[(int) n];
    Arrays.fill(result, string);
    return String.join("", result);
  }
}
