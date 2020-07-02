package codeWars.kyu7.maximumMultiple_20200702;

public class MaxMultiple {

  public static int maxMultiple(int divisor, int bound) {
    for (int i = bound; i > 0; i--) {
      if (i % divisor == 0) {
        return i;
      }
    }
    return -1;
  }
}
