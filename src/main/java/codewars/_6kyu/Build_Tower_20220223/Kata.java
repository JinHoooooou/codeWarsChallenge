package codewars._6kyu.Build_Tower_20220223;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

  public static String[] TowerBuilder(int nFloors) {
    String[] result = new String[nFloors];
    int bottomLength = nFloors * 2 - 1;
    int eraseIndex = 0;
    String[] tower = formatBottom(bottomLength);
    for (int i = nFloors - 1; i >= 0; i--, eraseIndex++) {
      result[i] = String.join("", tower);
      tower[eraseIndex] = " ";
      tower[bottomLength - 1 - eraseIndex] = " ";
    }
    return result;
  }

  private static String[] formatBottom(int bottomLength) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < bottomLength; i++) {
      result.append("*");
    }
    return result.toString().split("");
  }
}
