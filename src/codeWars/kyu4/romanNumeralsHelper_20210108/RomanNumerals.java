package codeWars.kyu4.romanNumeralsHelper_20210108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

  static Map<Integer, String> romanMap;

  static {
    romanMap = new TreeMap<>(Comparator.reverseOrder());
    romanMap.put(1, "I");
    romanMap.put(4, "IV");
    romanMap.put(5, "V");
    romanMap.put(9, "IX");
    romanMap.put(10, "X");
    romanMap.put(40, "XL");
    romanMap.put(50, "L");
    romanMap.put(90, "XC");
    romanMap.put(100, "C");
    romanMap.put(400, "CD");
    romanMap.put(500, "D");
    romanMap.put(900, "CM");
    romanMap.put(1000, "M");
  }

  public static String toRoman(int n) {
    String result = "";
    for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
      while (n >= entry.getKey()) {
        result += entry.getValue();
        n -= entry.getKey();
      }
    }

    return result;
  }

  public static int fromRoman(String romanNumeral) {
    romanNumeral = romanNumeral.replaceAll("IV", "4+");
    romanNumeral = romanNumeral.replaceAll("XL", "40+");
    romanNumeral = romanNumeral.replaceAll("CD", "400+");
    romanNumeral = romanNumeral.replaceAll("IX", "9+");
    romanNumeral = romanNumeral.replaceAll("XC", "90+");
    romanNumeral = romanNumeral.replaceAll("CM", "900+");
    romanNumeral = romanNumeral.replaceAll("D", "500+");
    romanNumeral = romanNumeral.replaceAll("L", "50+");
    romanNumeral = romanNumeral.replaceAll("V", "5+");
    romanNumeral = romanNumeral.replaceAll("M", "1000+");
    romanNumeral = romanNumeral.replaceAll("C", "100+");
    romanNumeral = romanNumeral.replaceAll("X", "10+");
    romanNumeral = romanNumeral.replaceAll("I", "1+");

    return Arrays.stream(romanNumeral.split("\\+"))
        .filter(x -> !x.isEmpty())
        .mapToInt(Integer::parseInt)
        .sum();
  }
}
