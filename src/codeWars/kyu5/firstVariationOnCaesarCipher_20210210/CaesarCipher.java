package codeWars.kyu5.firstVariationOnCaesarCipher_20210210;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

  public static List<String> movingShift(String s, int shift) {
    String encoding = encoding(s, shift);

    return getSplitList(encoding);
  }

  private static String encoding(String s, int shift) {
    char[] array = s.toCharArray();
    for (int i = 0; i < array.length; i++) {
      if (Character.isLowerCase(array[i])) {
        array[i] = (char) (((array[i] - 'a' + shift + i) % 26) + 'a');
      } else if (Character.isUpperCase(array[i])) {
        array[i] = (char) (((array[i] - 'A' + shift + i) % 26) + 'A');
      }
    }
    return new String(array);
  }

  private static List<String> getSplitList(String encoding) {
    int length = (int) Math.ceil(encoding.length() / 5.0);
    List<String> result = new ArrayList<>();

    result.add(encoding.substring(0, length));
    result.add(encoding.substring(length, length * 2));
    result.add(encoding.substring(length * 2, length * 3));
    result.add(encoding.substring(length * 3, length * 4));
    result.add(encoding.substring(length * 4));

    return result;
  }

  public static String demovingShift(List<String> s, int shift) {
    String string = String.join("", s);
    char[] array = string.toCharArray();

    for (int i = 0; i < array.length; i++) {
      if (Character.isUpperCase(array[i])) {
        int point = (array[i] - 'A' - shift - i) % 26;
        array[i] = point < 0 ? (char) (26 + point + 'A') : (char) (point + 'A');
      } else if (Character.isLowerCase(array[i])) {
        int point = (array[i] - 'a' - shift - i) % 26;
        array[i] = point < 0 ? (char) (26 + point + 'a') : (char) (point + 'a');
      }
    }

    return String.valueOf(array);
  }
}
