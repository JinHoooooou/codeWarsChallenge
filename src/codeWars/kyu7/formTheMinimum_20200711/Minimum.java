package codeWars.kyu7.formTheMinimum_20200711;

import java.util.Arrays;

public class Minimum {

  public static int minValue(int[] values) {
    int[] modifiedArray = Arrays.stream(values).distinct().sorted().toArray();

    String result = "";
    for (int i = 0; i < modifiedArray.length; i++) {
      result += modifiedArray[i];
    }

    return Integer.parseInt(result);
  }
}
