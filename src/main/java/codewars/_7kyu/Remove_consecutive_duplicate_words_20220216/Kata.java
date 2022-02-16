package codewars._7kyu.Remove_consecutive_duplicate_words_20220216;

public class Kata {

  public static String removeConsecutiveDuplicates(String s) {
    String[] tokens = s.split(" ");
    String previous = tokens[0];
    for (int i = 1; i < tokens.length; i++) {
      if (previous.equals(tokens[i])) {
        tokens[i] = "";
      } else {
        previous = tokens[i];
      }
    }
    StringBuilder result = new StringBuilder();
    for (String token : tokens) {
      result.append(!token.equals("") ? token + " " : "");
    }
    return result.toString().trim();
  }

  public static String removeConsecutiveDuplicatesBestPractice(String s) {
    return s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
  }
}
