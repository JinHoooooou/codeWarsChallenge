package codeWars.kyu7.sortTheGiftCode_20200628;

import java.util.Arrays;

public class GiftSorter {

  public static String sortGiftCode(String code) {
    char[] toCharArray = code.toCharArray();
    Arrays.sort(toCharArray);
    return String.valueOf(toCharArray);
  }
}
