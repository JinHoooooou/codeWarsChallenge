package codeWars.kyu6.dashatizeIt_20200901;

public class SolutionBestPractice {

  public static String dashatize(int num) {
    String result = String.valueOf(num).replaceAll("([13579])", "-$1-")
        .replaceAll("--", "-")
        .replaceAll("^-|-$", "");
    ;

    return result;
  }
}
