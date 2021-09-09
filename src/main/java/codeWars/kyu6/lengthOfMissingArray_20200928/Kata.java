package codeWars.kyu6.lengthOfMissingArray_20200928;

import java.util.Arrays;

public class Kata {

  public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
    if (arrayOfArrays.length == 0) {
      return 0;
    }

    int[] arrayLength = new int[arrayOfArrays.length];
    for (int i = 0; i < arrayLength.length; i++) {
      if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
        return 0;
      }
      arrayLength[i] = arrayOfArrays[i].length;
    }
    Arrays.sort(arrayLength);
    int target = arrayLength[0];
    for (int i = 0; i < arrayLength.length; i++) {
      if (target++ != arrayLength[i]) {
        return target - 1;
      }
    }
    return 0;
  }
}
