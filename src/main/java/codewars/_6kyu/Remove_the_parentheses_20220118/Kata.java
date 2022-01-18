package codewars._6kyu.Remove_the_parentheses_20220118;

public class Kata {

  public static String removeParentheses(final String str) {

    String result = str;
    while (result.contains("(")) {
      int openIndex = getOpenIndex(result);
      int closeIndex = getCloseIndex(result, openIndex);
      result = removeParenthese(result, openIndex, closeIndex);
    }

    return result;
  }

  private static String removeParenthese(String result, int openIndex, int closeIndex) {
    result = result.substring(0, openIndex) + result.substring(closeIndex + 1);
    return result;
  }

  private static int getOpenIndex(String result) {
    return result.indexOf('(');
  }

  private static int getCloseIndex(String result, int openIndex) {
    int closeIndex = 0;
    int openParentheseCount = 1;
    for (int i = openIndex + 1; i < result.length(); i++) {
      if (result.charAt(i) == '(') {
        openParentheseCount++;
      }
      if (result.charAt(i) == ')') {
        openParentheseCount--;
      }
      if (openParentheseCount == 0) {
        closeIndex = i;
        break;
      }
    }
    return closeIndex;
  }

  public static String removeParenthesesBestPractice(final String str) {
    String updated = str.replaceAll("\\([^()]*\\)", "");
    return updated.contains("(") ? removeParenthesesBestPractice(updated) : updated;
  }
}
