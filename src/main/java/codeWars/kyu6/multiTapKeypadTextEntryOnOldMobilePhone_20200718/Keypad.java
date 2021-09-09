package codeWars.kyu6.multiTapKeypadTextEntryOnOldMobilePhone_20200718;

import java.util.HashMap;
import java.util.Map;

public class Keypad {

  public static int presses(String phrase) {
    Map<String, Integer> keypadPressCountMap = getKeypadPressCountMap();
    int pressCount = 0;
    for (String character : phrase.toUpperCase().split("")) {
      pressCount += keypadPressCountMap.getOrDefault(character, 0);
    }
    return pressCount;
  }

  private static Map<String, Integer> getKeypadPressCountMap() {
    Map<String, Integer> result = new HashMap<>();
    char alphabet = 'A';
    for (int i = 0; i < 10; i++) {
      if (i == 0) {
        result.put(" ", 1);
        result.put(String.valueOf(i), 2);
      } else if (i == 1) {
        result.put(String.valueOf(i), 1);
      } else if (i == 7 || i == 9) {
        for (int j = 1; j < 5; j++) {
          result.put(String.valueOf(alphabet++), j);
        }
        result.put(String.valueOf(i), 5);
      } else {
        for (int j = 1; j < 4; j++) {
          result.put(String.valueOf(alphabet++), j);
        }
        result.put(String.valueOf(i), 4);
      }
    }
    result.put("*", 1);
    result.put("#", 1);
    return result;
  }
}

