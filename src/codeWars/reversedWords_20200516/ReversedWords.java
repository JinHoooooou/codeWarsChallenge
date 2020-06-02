package codeWars.reversedWords_20200516;

public class ReversedWords {

  public static String reversedWords(String str) {
    String[] words = str.split(" ");
    String result = "";
    for (int i = words.length - 1; i >= 0; i--) {
      result += words[i] + " ";
    }
    return result.trim();
  }
}
