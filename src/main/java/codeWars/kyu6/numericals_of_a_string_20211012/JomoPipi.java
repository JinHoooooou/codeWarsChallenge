package codeWars.kyu6.numericals_of_a_string_20211012;

import java.util.HashMap;
import java.util.Map;

public class JomoPipi {

  public static String numericals(String s) {
    Map<String, Integer> map = new HashMap<>();
    StringBuilder result = new StringBuilder();
    for (String character : s.split("")) {
      map.put(character, map.getOrDefault(character, 0) + 1);
      result.append(map.get(character));
    }

    return result.toString();
  }
}
