package codeWars.kyu8.wellOfIdeas_20200703;

import java.util.Arrays;

public class Kata {

  public static String well(String[] x) {
    int goodCount = (int) Arrays.stream(x).filter(s -> s.equals("good")).count();
    if (goodCount == 0) {
      return "Fail!";
    }
    if (goodCount > 2) {
      return "I smell a series!";
    }
    return "Publish!";
  }
}
