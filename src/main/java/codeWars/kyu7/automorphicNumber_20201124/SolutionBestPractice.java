package codeWars.kyu7.automorphicNumber_20201124;

public class SolutionBestPractice {

  static final String TRUE = "Automorphic";
  static final String FALSE = "Not!!";

  public static String autoMorphic(int number) {
    return (number * number + "").endsWith(number + "") ? TRUE : FALSE;
  }
}
