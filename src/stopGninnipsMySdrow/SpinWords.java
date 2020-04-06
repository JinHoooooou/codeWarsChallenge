package stopGninnipsMySdrow;

public class SpinWords {
  public static String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      word = checkAndReverseWord(word);
      result.append(word).append(" ");
    }
    return result.deleteCharAt(result.length() - 1).toString();
  }

  private static String checkAndReverseWord(String word) {
    if (word.length() >= 5) {
      char[] reverseWord = new char[word.length()];
      for (int i = 0; i < word.length(); i++) {
        reverseWord[i] = word.charAt(word.length() - (i + 1));
      }
      word = String.valueOf(reverseWord);
    }
    return word;
  }


  /*public static String spinWords2(String sentence) {
    String[] words = sentence.split(" ");
    for(int i = 0; i < words.length; i++) {
      if(words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ", words)
  }
  */
}
