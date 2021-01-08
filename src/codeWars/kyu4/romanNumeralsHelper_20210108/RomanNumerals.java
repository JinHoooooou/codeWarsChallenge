package codeWars.kyu4.romanNumeralsHelper_20210108;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

  static Map<Integer, String> romanMap;

  static {
    romanMap = new HashMap<>();
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
    String digits = String.valueOf(n);
    String result = "";
    for (int i = 0; i < digits.length(); i++) {
      int digit = Integer.parseInt(digits.charAt(i) + "");
      int pow = (int) Math.pow(10, digits.length() - 1 - i);
      int target = digit * pow;
      while (target > 0) {
        int minus = 0;
        if (digit == 4) {
          digit -= 4;
          minus = 4 * pow;
        } else if (digit == 5) {
          digit -= 5;
          minus = 5 * pow;
        } else if (digit == 9) {
          digit -= 9;
          minus = 9 * pow;
        } else if (digit == 1) {
          digit -= 1;
          minus = 1 * pow;
        } else if (digit > 5 && digit < 9) {
          digit -= 5;
          minus = 5 * pow;
        } else {
          digit -= 1;
          minus = 1 * pow;
        }
        result += romanMap.get(minus);
        target -= minus;
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

    String[] nums = romanNumeral.split("\\+");
    int result = 0;
    result = Arrays.stream(nums).filter(x -> !x.isEmpty()).mapToInt(Integer::parseInt).sum();

    return result;
  }
}
