package codewars._6kyu.Are_we_alternate_20220222;

import java.util.function.Predicate;

public class Solution {

  public static boolean isAlt(String word) {
    Predicate<String> isVowel = c -> c.matches("[aeiou]");
    for (int i = 0; i < word.length() - 1; i++) {
      if (isVowel.test(word.charAt(i) + "") == isVowel.test(word.charAt(i + 1) + "")) {
        return false;
      }
    }

    return true;
  }

  public static boolean isAltBestPractice(String word) {
    return word.matches("[aeiou]?([^aeiou][aeiou])*[^aeiou]?");
  }
}
