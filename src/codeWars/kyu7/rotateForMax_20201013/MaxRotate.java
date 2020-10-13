package codeWars.kyu7.rotateForMax_20201013;

public class MaxRotate {

  public static long maxRot(long n) {
    long max = n;
    String toString = String.valueOf(n);
    for (int i = 0; i < toString.length() - 1; i++) {
      toString = rotate(toString, i);
      max = Math.max(max, Long.parseLong(toString));
    }
    return max;
  }

  private static String rotate(String toString, int index) {
    return toString.substring(0, index) + toString.substring(index + 1) + toString.charAt(index);
  }

}
