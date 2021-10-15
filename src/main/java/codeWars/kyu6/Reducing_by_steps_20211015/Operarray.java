package codeWars.kyu6.Reducing_by_steps_20211015;

import static java.lang.Math.abs;

import java.util.function.BinaryOperator;

public class Operarray {

  public static long gcdi(long x, long y) {
    return abs(y) == 0 ? abs(x) : gcdi(abs(y), abs(x) % abs(y));
  }

  public static long lcmu(long x, long y) {
    return abs(x) * abs(y) / gcdi(x, y);
  }

  public static long som(long x, long y) {
    return x + y;
  }

  public static long maxi(long x, long y) {
    return Math.max(x, y);
  }

  public static long mini(long x, long y) {
    return Math.min(x, y);
  }

  public static long[] operArray(BinaryOperator<Long> operator, long[] arr, long init) {
    long[] result = new long[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = operator.apply(i == 0 ? init : result[i - 1], arr[i]);
    }
    return result;
  }

}
