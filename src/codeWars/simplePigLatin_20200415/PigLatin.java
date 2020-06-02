package codeWars.simplePigLatin_20200415;

public class PigLatin {

  static final String ADD_LETTERS = "ay";
  static final int MOVE_LETTER_LENGTH = 1;

  public static String pigIt(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = makePigLatinEachWord(words[i]);
    }
    return String.join(" ", words);
  }

  private static String makePigLatinEachWord(String word) {
    if (word.matches("[a-zA-z0-9]+")) {
      return word.substring(MOVE_LETTER_LENGTH) + word.substring(0, MOVE_LETTER_LENGTH)
          + ADD_LETTERS;
    }
    return word;
  }
}
