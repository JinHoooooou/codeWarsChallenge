package codeWars.kyu7.theOldSwitcheroo_20210222;

public class Kata {

  public static String vowel2Index(String s) {
    String[] alphabets = s.split("");
    for (int i = 0; i < alphabets.length; i++) {
      if (alphabets[i].matches("[aeiou]")) {
        alphabets[i] = "" + (i + 1);
      }
    }
    String result = String.join("", alphabets);
    return result;
  }

}
