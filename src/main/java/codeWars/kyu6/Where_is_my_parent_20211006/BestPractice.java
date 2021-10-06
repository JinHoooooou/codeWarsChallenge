package codeWars.kyu6.Where_is_my_parent_20211006;

import java.util.Arrays;

public class BestPractice {

  public static String findChildren(final String text) {
    String[] chars = text.split("");
    Arrays.sort(chars);
    Arrays.sort(chars, String.CASE_INSENSITIVE_ORDER);

    return String.join("", chars);
  }
}
