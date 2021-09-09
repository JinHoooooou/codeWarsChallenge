package codeWars.kyu6.movesInSquaredStrings_20210311;

import java.util.Arrays;
import java.util.function.Function;

public class Opstrings1 {

  public static String rot(String strng) {
    return new StringBuilder(strng).reverse().toString();
  }

  public static String selfieAndRot(String strng) {
    String[] words = strng.split("\n");
    String[] result = new String[words.length * 2];
    String dot = makeDot(words.length);
    for (int i = 0; i < words.length; i++) {
      result[i] = words[i] + dot;
      result[result.length - 1 - i] = dot + new StringBuilder(words[i]).reverse().toString();
    }
    return String.join("\n", result);
  }

  private static String makeDot(int length) {
    String[] dots = new String[length];
    Arrays.fill(dots, ".");
    return String.join("", dots);
  }


  public static String oper(Function<String, String> operator, String s) {
    return operator.apply(s);
  }
}
