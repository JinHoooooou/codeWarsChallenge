package codeWars.kyu7.last_20200925;

import java.util.List;

public class Solution {

  public static <T> T last(final List<T> list) {
    return list.get(list.size() - 1);
  }

  public static char last(final String string) {
    return string.charAt(string.length() - 1);
  }

  public static <T> T last(final T... list) {
    return list[list.length - 1];
  }
}
