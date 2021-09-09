package codeWars.kyu7.partsOfList_20200809;

import java.util.Arrays;

public class Partlist {

  public static String[][] partlist(String[] arr) {
    String[][] result = new String[arr.length - 1][2];
    for (int i = 0; i < result.length; i++) {
      result[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
      result[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
    }
    return result;
  }
}
