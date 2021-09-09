package codeWars.kyu7.splitInParts_20210202;

public class InParts {

  public static String splitInParts(String s, int partLength) {
    return s.replaceAll("(.{" + partLength + "})", "$0 ").trim();
  }
}
