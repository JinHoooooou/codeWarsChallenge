package codeWars.kyu6.breakCamelCase_20200611;

public class SolutionBestPractice {

  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1").trim();
  }
}
