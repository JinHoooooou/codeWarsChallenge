package codeWars.kyu7.Pandemia_20211015;

import java.util.Arrays;

public class Pandemia {

  public static double infected(String input) {
    String[] maps = input.split("X");
    double peopleCount = 0;
    double infectedCount = 0;
    for (String map : maps) {
      peopleCount += map.length();
      if (map.contains("1")) {
        infectedCount += map.length();
      }
    }

    return peopleCount == 0 ? 0 : 100 * (infectedCount / peopleCount);
  }
}
