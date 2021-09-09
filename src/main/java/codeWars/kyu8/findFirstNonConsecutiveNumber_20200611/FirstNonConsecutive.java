package codeWars.kyu8.findFirstNonConsecutiveNumber_20200611;

public class FirstNonConsecutive {

  public static Integer find(final int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] - array[i - 1] != 1) {
        return array[i];
      }
    }
    return null;
  }
}
