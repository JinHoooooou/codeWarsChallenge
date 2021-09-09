package codeWars.kyu6.helpTheBookseller_20200702;

import java.util.HashMap;
import java.util.Map;

public class StockList {

  public static String stockSummary(String[] lstOfArt, String[] lstOf1stletter) {
    if (lstOfArt.length == 0) {
      return "";
    }
    Map<String, Integer> artMap = getArtMap(lstOfArt);
    String[] result = getResultArray(lstOf1stletter, artMap);
    return String.join(" - ", result);
  }

  private static String[] getResultArray(String[] lstOf1stletter, Map<String, Integer> artMap) {
    String[] result = new String[lstOf1stletter.length];
    for (int i = 0; i < lstOf1stletter.length; i++) {
      result[i] = String
          .format("(%s : %d)", lstOf1stletter[i], artMap.getOrDefault(lstOf1stletter[i], 0));
    }
    return result;
  }

  private static Map<String, Integer> getArtMap(String[] lstOfArt) {
    Map<String, Integer> artMap = new HashMap<>();
    for (String art : lstOfArt) {
      artMap.put(getFirstLetterOfCode(art),
          artMap.getOrDefault(getFirstLetterOfCode(art), 0) + getStock(art));
    }
    return artMap;
  }

  private static int getStock(String code) {
    String[] codeAndStock = code.split(" ");
    return Integer.parseInt(codeAndStock[1]);
  }

  private static String getFirstLetterOfCode(String code) {
    return code.charAt(0) + "";
  }
}
