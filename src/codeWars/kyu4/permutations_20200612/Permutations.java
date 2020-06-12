package codeWars.kyu4.permutations_20200612;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

  public static Set<String> element = new HashSet<>();

  public static List<String> singlePermutations(String s) {
    element.clear();
    process(s, "", s.length());
    return new ArrayList<>(element);
  }

  public static void process(String remainingString, String targetString, int wantedLength) {
    if (targetString.length() == wantedLength) {
      element.add(targetString);
      return;
    }

    for (int i = 0; i < remainingString.length(); i++) {
      process(remainingString.substring(0, i) + remainingString.substring(i + 1),
          targetString + remainingString.charAt(i), wantedLength);
    }
  }
}
