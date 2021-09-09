package codeWars.kyu6.whatCenturyIsIt_20210117;

public class Solution {

  public static String whatCentury(int year) {
    int number = getNumber(year);
    String string = getString(number);
    return number + string;
  }

  private static String getString(int number) {
    if (number % 10 == 1 && number != 11) {
      return "st";
    } else if (number % 10 == 2 && number != 12) {
      return "nd";
    } else if (number % 10 == 3 && number != 13) {
      return "rd";
    }
    return "th";
  }

  private static int getNumber(int year) {

    return year % 100 == 0 ? (year / 100) : (year / 100) + 1;
  }
}
