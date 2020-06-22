package codeWars.kyu8.switchItUp_20200622;

import java.util.HashMap;
import java.util.Map;

public class Kata {

  public static String switchItUp(int number) {
    Map<Integer, String> switchMap = getSwitchMap();
    return switchMap.get(number);
  }

  private static Map<Integer, String> getSwitchMap() {
    Map<Integer, String> switchMap = new HashMap<>();
    switchMap.put(0, "Zero");
    switchMap.put(1, "One");
    switchMap.put(2, "Two");
    switchMap.put(3, "Three");
    switchMap.put(4, "Four");
    switchMap.put(5, "Five");
    switchMap.put(6, "Six");
    switchMap.put(7, "Seven");
    switchMap.put(8, "Eight");
    switchMap.put(9, "Nine");
    return switchMap;
  }
}
