package codewars._6kyu.Simple_transposition_20220105;

public class Kata {

  public static StringBuilder result;

  public static String simpleTransposition(String text) {
    result = new StringBuilder();

    appendCharacterByTwoStep(0, text);
    appendCharacterByTwoStep(1, text);

    return result.toString();
  }

  private static void appendCharacterByTwoStep(int startIndex, String text) {
    for (int i = startIndex; i < text.length(); i += 2) {
      result.append(text.charAt(i));
    }
  }
}
