package validBraces_20200511;

public class BraceChecker {

  public boolean isValid(String braces) {
    String brace = braces;
    for (int i = 0; i < braces.length() / 2; i++) {
      brace = brace.replaceAll("\\(\\)", "");
      brace = brace.replaceAll("\\{\\}", "");
      brace = brace.replaceAll("\\[\\]", "");
      if (brace.length() == 0) {
        return true;
      }
    }
    return false;
  }
}
