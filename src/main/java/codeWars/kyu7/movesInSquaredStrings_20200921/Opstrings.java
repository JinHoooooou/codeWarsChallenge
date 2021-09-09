package codeWars.kyu7.movesInSquaredStrings_20200921;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Opstrings {

  public static String vertMirror(String string) {
    return Arrays.stream(string.split("\n")).map(i -> new StringBuilder(i).reverse().toString())
        .collect(Collectors.joining("\n"));
  }

  public static String horMirror(String string) {
    List<String> list = Arrays.asList(string.split("\n"));
    Collections.reverse(list);
    return String.join("\n", list);
  }

  public static String oper(Function<String, String> operator, String string) {
    String temp = "";
    return operator.apply(string);
  }

}
