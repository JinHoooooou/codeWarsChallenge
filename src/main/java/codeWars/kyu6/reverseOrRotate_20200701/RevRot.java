package codeWars.kyu6.reverseOrRotate_20200701;

import java.util.stream.Stream;

public class RevRot {

  public static String revRot(String string, int size) {
    if (size == 0) {
      return "";
    }
    String result = "";
    while (string.length() >= size) {
      String subString = string.substring(0, size);
      int sumOfDigits = Stream.of(subString.split("")).mapToInt(Integer::parseInt).sum();
      result += sumOfDigits % 2 != 0 ? rotate(subString) : reverse(subString);
      string = string.substring(size);
    }
    return result;
  }

  private static String reverse(String subString) {
    return new StringBuilder(subString).reverse().toString();
  }

  private static String rotate(String subString) {
    return subString.substring(1) + subString.charAt(0);
  }
}
