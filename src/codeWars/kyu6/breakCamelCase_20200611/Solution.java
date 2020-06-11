package codeWars.kyu6.breakCamelCase_20200611;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static String camelCase(String input) {
    List<String> words = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      if ((i != 0) && (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
        words.add(input.substring(0, i));
        input = input.substring(i);
        i = 0;
      }
    }
    words.add(input);
    return String.join(" ", words);
  }
}
