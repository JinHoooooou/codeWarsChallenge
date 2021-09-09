package codeWars.kyu4.parseIntReloaded_20201020;

import java.util.HashMap;
import java.util.Map;

public class Parser {

  static Map<String, Integer> numberMap;
  static final String THOUSAND = "thousand";
  static final String HUNDRED = "hundred";

  static {
    numberMap = new HashMap<>();
    buildOneDigits(numberMap);
    buildTwoDigits(numberMap);
    numberMap.put("one million", 1000000);
  }

  public static int parseInt(String numStr) {
    numStr = numStr.replaceAll(" and ", " ");
    if (numStr.contains(THOUSAND)) {
      String[] split = numStr.split(THOUSAND);
      return split.length == 1 ? parseInt(split[0].trim()) * 1000 :
          (parseInt(split[0].trim()) * 1000) + parseInt(split[1].trim());
    } else if (numStr.contains(HUNDRED)) {
      String[] split = numStr.split(HUNDRED);
      return split.length == 1 ? parseInt(split[0].trim()) * 100 :
          (parseInt(split[0].trim()) * 100) + parseInt(split[1].trim());
    }
    String[] split = numStr.split("-");
    return split.length == 1 ? numberMap.getOrDefault(split[0].trim(), 0) :
        numberMap.getOrDefault(split[0].trim(), 0) + numberMap.getOrDefault(split[1].trim(), 0);
  }


  private static void buildTwoDigits(Map<String, Integer> numberMap) {
    numberMap.put("ten", 10);
    numberMap.put("twenty", 20);
    numberMap.put("thirty", 30);
    numberMap.put("forty", 40);
    numberMap.put("fifty", 50);
    numberMap.put("sixty", 60);
    numberMap.put("seventy", 70);
    numberMap.put("eighty", 80);
    numberMap.put("ninety", 90);
    numberMap.put("eleven", 11);
    numberMap.put("twelve", 12);
    numberMap.put("thirteen", 13);
    numberMap.put("fourteen", 14);
    numberMap.put("fifteen", 15);
    numberMap.put("sixteen", 16);
    numberMap.put("seventeen", 17);
    numberMap.put("eighteen", 18);
    numberMap.put("nineteen", 19);
  }

  private static void buildOneDigits(Map<String, Integer> numberMap) {
    numberMap.put("zero", 0);
    numberMap.put("one", 1);
    numberMap.put("two", 2);
    numberMap.put("three", 3);
    numberMap.put("four", 4);
    numberMap.put("five", 5);
    numberMap.put("six", 6);
    numberMap.put("seven", 7);
    numberMap.put("eight", 8);
    numberMap.put("nine", 9);
  }
}
