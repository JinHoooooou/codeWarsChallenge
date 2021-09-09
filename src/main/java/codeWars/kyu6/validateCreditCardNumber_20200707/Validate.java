package codeWars.kyu6.validateCreditCardNumber_20200707;

import java.util.Arrays;

public class Validate {

  public static boolean validate(String n) {
    int[] doubledArray = getDoubledArray(n);
    return Arrays.stream(doubledArray).sum() % 10 == 0;
  }

  private static int[] getDoubledArray(String n) {
    int[] doubledArray = Arrays.stream(n.split(""))
        .mapToInt(Integer::parseInt)
        .toArray();

    for (int i = doubledArray.length - 2; i >= 0; i -= 2) {
      doubledArray[i] =
          doubledArray[i] > 4 ? (doubledArray[i] * 2) - 9 : doubledArray[i] * 2;
    }

    return doubledArray;
  }
}
