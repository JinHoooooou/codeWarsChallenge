package codeWars.romanNumeralsEncoder;

import java.util.Comparator;
import java.util.TreeMap;

public class Conversion {

  public String solution(int n) {
    String result = "";
    TreeMap<Integer, String> map = getRomanNumberMap();

    for (Integer romanNumber : map.keySet()) {
      while (n >= romanNumber) {
        result += map.get(romanNumber);
        n -= romanNumber;
      }
    }
    return result;
  }

  private TreeMap<Integer, String> getRomanNumberMap() {
    TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
    map.put(1, "I");
    map.put(4, "IV");
    map.put(5, "V");
    map.put(9, "IX");
    map.put(10, "X");
    map.put(40, "XL");
    map.put(50, "L");
    map.put(90, "XC");
    map.put(100, "C");
    map.put(400, "CD");
    map.put(500, "D");
    map.put(900, "CM");
    map.put(1000, "M");
    return map;
  }
}
