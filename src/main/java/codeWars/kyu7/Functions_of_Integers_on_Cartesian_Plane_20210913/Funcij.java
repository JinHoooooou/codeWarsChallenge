package codeWars.kyu7.Functions_of_Integers_on_Cartesian_Plane_20210913;

import java.math.BigInteger;

public class Funcij {

  public static BigInteger sumin(int n) {
    BigInteger result = BigInteger.ZERO;
    for (int min = 1; min <= n; min++) {
      result = result.add(BigInteger.valueOf(min * ((n - min + 1) * 2 - 1)));
    }
    return result;
  }

  public static BigInteger sumax(int n) {
    BigInteger result = BigInteger.ZERO;
    for (int max = 1; max <= n; max++) {
      result = result.add(BigInteger.valueOf(max * (max * 2 - 1)));
    }
    return result;
  }

  public static BigInteger sumsum(int n) {
    return sumin(n).add(sumax(n));
  }
}
