package codeWars.kyu6.Where_is_my_parent_20211006;

import java.util.Arrays;

public class WhereIsMyParent {

  public static String findChildren(final String text) {
    String result = String.valueOf(text);
    result = result.toLowerCase();

    String[] chars = result.split("");
    Arrays.sort(chars);

    String current = "";
    for (int i = 0; i < chars.length; i++) {
      if (!chars[i].equals(current)) {
        current = chars[i];
        chars[i] = chars[i].toUpperCase();
      }
    }

    return String.join("", chars);
  }
}
