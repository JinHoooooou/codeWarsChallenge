package convertNumberToReversedArrayOfDigits_20200501;

import java.util.Arrays;

public class Kata {

  public static int[] digitize(long n) {
    String[] split = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
    int[] result = new int[split.length];
    for (int i = 0; i < split.length; i++) {
      result[i] = Integer.parseInt(split[i]);
    }
    return result;
  }
}
