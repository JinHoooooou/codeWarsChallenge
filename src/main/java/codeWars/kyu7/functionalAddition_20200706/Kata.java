package codeWars.kyu7.functionalAddition_20200706;

import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
    return num -> num + n;
  }
}
