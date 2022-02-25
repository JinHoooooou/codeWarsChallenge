package codewars._6kyu.Longest_alphabetical_substring_20220225;

public class StringHandling {

  public static String longestAlpabeticalSubstring(String text) {
    int i, j;
    String result = "";
    for (i = 0; i < text.length(); i++) {
      for (j = i; j < text.length() - 1; j++) {
        if (text.charAt(j) > text.charAt(j + 1)) {
          break;
        }
      }
      if (result.length() < text.substring(i, j + 1).length()) {
        result = text.substring(i, j + 1);
      }
    }
    return result;
  }

  public static String longestAlpabeticalSubstringBestPractice(String text) {
    int start = 0;
    int offset = 0;
    for (int i = 1, j = 0; i < text.length(); i++) {
      if (text.charAt(i - 1) > text.charAt(i)) {
        j = i;
      } else if (i - j > offset - start) {
        start = j;
        offset = i;
      }
    }
    return text.substring(start, offset + 1);
  }
}
