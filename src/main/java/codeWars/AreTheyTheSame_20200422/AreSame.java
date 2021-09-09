package codeWars.AreTheyTheSame_20200422;

import java.util.Arrays;

public class AreSame {

  public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null) {
      return false;
    }
    a = Arrays.stream(a).map(x -> x * x).sorted().toArray();
    Arrays.sort(b);
    return Arrays.equals(a, b);
//    if (a == null || b == null) {
//      return false;
//    }
//
//    int[] powerOfA = Arrays.stream(a).map(x -> x * x).toArray();
//    Arrays.sort(powerOfA);
//    Arrays.sort(b);
//    return Arrays.equals(powerOfA, b);
  }
}