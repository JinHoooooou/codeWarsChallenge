package codeWars.kyu7.reverseNumber_20201013;

public class ReverseNumber {

  public static int reverse(int number) {
    String reverse = new StringBuilder(Math.abs(number) + "").reverse().toString();

    return number < 0 ? Integer.parseInt(reverse) * -1 : Integer.parseInt(reverse);
  }

}
