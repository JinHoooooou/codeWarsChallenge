package doNotSolve.codewars.kyu4.decodeTheMorseCodeAdvanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {

  static Map<String, String> morseCodeMap = new HashMap<>();

  static {
    morseCodeMap.put(".-", "A");
    morseCodeMap.put("-...", "B");
    morseCodeMap.put("-.-.", "C");
    morseCodeMap.put("-..", "D");
    morseCodeMap.put(".", "E");
    morseCodeMap.put("..-.", "F");
    morseCodeMap.put("--.", "G");
    morseCodeMap.put("....", "H");
    morseCodeMap.put("..", "I");
    morseCodeMap.put(".---", "J");
    morseCodeMap.put("-.-", "K");
    morseCodeMap.put(".-..", "L");
    morseCodeMap.put("--", "M");
    morseCodeMap.put("-.", "N");
    morseCodeMap.put("---", "O");
    morseCodeMap.put(".--.", "P");
    morseCodeMap.put("--.-", "Q");
    morseCodeMap.put(".-.", "R");
    morseCodeMap.put("...", "S");
    morseCodeMap.put("-", "T");
    morseCodeMap.put("..-", "U");
    morseCodeMap.put("...-", "V");
    morseCodeMap.put(".--", "W");
    morseCodeMap.put("-..-", "X");
    morseCodeMap.put("-.--", "Y");
    morseCodeMap.put("--..", "Z");
  }

  public static String decodeBits(String bits) {
    String trimBits = bits.replaceAll("^0+|0+$", "");
    List<String> morseCodeList = new ArrayList<>();
    int timeUnit = getTimeUnit(trimBits);

    String wordDelimiterRegex = "0{" + (timeUnit * 7) + "}";
    String letterDelimiterRegex = "0{" + (timeUnit * 3) + "}";
    String morseCodeDelimiterRegex = "0{" + (timeUnit) + "}";

    for (String word : trimBits.split(wordDelimiterRegex)) {
      for (String letter : word.split(letterDelimiterRegex)) {
        for (String morseCode : letter.split(morseCodeDelimiterRegex)) {
          morseCodeList.add(morseCode.length() > timeUnit ? "-" : ".");
        }
        morseCodeList.add(" ");
      }
      morseCodeList.add("  ");
    }

    return String.join("", morseCodeList).trim();
  }

  private static int getTimeUnit(String bits) {
    int min = Integer.MAX_VALUE;
    Matcher matcher = Pattern.compile("1+|0+").matcher(bits);
    while (matcher.find()) {
      String target = matcher.group();
      min = Math.min(min, target.length());
    }
    return min;
  }

  public static String decodeMorse(String morseCode) {
    String result = "";
    for (String word : morseCode.split("   ")) {
      for (String letter : word.split(" ")) {
        result += morseCodeMap.get(letter);
      }
      result += " ";
    }

    return result.trim();
  }
}
