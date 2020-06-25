package codeWars.kyu8.allStarCodeChallenge_20200625;

public class CodeWars {

  public static int strCount(String str, char letter) {
    return (int) str.chars().filter(x -> x == letter).count();
  }
}
