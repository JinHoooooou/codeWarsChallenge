package codeWars.kyu6.binary_to_text_conversion_20210924;

public class Solution {

  public static String binaryToText(String binary) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < binary.length(); i += 8) {
      result.append((char) Integer.parseInt(binary.substring(i, i + 8), 2));
    }

    return result.toString();
  }
}
