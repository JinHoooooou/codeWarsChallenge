package codeWars.kyu7.insertDash_20210111;

public class BestPractice {

  public static String insertDash(int num) {
    return (num + "").replaceAll("([13579])(?=[13579])", "$1-");
  }
}
