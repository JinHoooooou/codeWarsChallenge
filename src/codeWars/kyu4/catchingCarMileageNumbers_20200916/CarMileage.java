package codeWars.kyu4.catchingCarMileageNumbers_20200916;

import java.util.Arrays;

public class CarMileage {

  static final int INTERESTING = 2;
  static final int NEAR_INTERESTING = 1;
  static final int BORING = 0;
  static final String INCREMENT = "1234567890";
  static final String DECREMENT = "9876543210";

  public static int isInteresting(int number, int[] awesomePhrases) {
    System.out.println(number);
    System.out.println(Arrays.toString(awesomePhrases));
    if (checkInteresting(number, awesomePhrases)) {
      return INTERESTING;
    } else if (checkInteresting(number + 1, awesomePhrases)) {
      return NEAR_INTERESTING;
    } else if (checkInteresting(number + 2, awesomePhrases)) {
      return NEAR_INTERESTING;
    }

    return BORING;
  }

  private static boolean checkInteresting(int number, int[] awesomePhrases) {
    return (number >= 100)
        && (isFollowedByAllZero(number)
        || isdIncrementingDigit(number)
        || isDecrementingDigit(number)
        || isPalindrome(number)
        || isAwesomePhrases(number, awesomePhrases));
  }

  private static boolean isFollowedByAllZero(int number) {
    return String.valueOf(number).matches("\\d0+");
  }

  private static boolean isdIncrementingDigit(int number) {
    return INCREMENT.contains(String.valueOf(number));
  }

  private static boolean isDecrementingDigit(int number) {
    return DECREMENT.contains(String.valueOf(number));
  }

  private static boolean isPalindrome(int number) {
    String toString = String.valueOf(number);
    return toString.equals(new StringBuilder(toString).reverse().toString());
  }

  private static boolean isAwesomePhrases(int number, int[] awesomePhrases) {
    return Arrays.stream(awesomePhrases).anyMatch(x -> x == number);
  }

}
