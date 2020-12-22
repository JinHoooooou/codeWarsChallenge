package codeWars.kyu7.compareStringsBySumOfChars_20201222;

public class Kata {

  public static boolean compare(String s1, String s2) {

    return getSum(s1) == getSum(s2);
  }

  private static int getSum(String string) {
    if (string == null || !string.matches("[a-zA-z]+")) {
      return 0;
    }
    return string.toUpperCase().chars().sum();
  }
}
