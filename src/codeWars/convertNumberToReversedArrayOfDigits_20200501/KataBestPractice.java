package codeWars.convertNumberToReversedArrayOfDigits_20200501;

public class KataBestPractice {

  public static int[] digitize(long n) {
    return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue)
        .toArray();
  }
}
