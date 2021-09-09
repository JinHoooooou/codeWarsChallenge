package codeWars.IsThisATriangle_20200329;

import java.util.Arrays;

public class TriangleTester {

  public static boolean isTriangle(int a, int b, int c) {
    int[] list = {a, b, c};
    Arrays.sort(list);
    return list[0] + list[1] > list[2];

  }

}
