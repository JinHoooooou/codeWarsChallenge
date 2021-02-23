package codeWars.kyu7.makeBackronym_20210223;

import java.util.Map;
import java.util.stream.Collectors;

public class Backronym {

  private static Map<String, String> dictionary;

  public static String makeBackronym(String acronym) {
    return acronym.toUpperCase().chars()
        .mapToObj(x -> dictionary.get((char) x + ""))
        .collect(Collectors.joining(" "));
  }
}
