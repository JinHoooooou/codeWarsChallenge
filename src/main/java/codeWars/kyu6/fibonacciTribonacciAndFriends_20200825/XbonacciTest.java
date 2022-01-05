package codeWars.kyu6.fibonacciTribonacciAndFriends_20200825;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class XbonacciTest {

  Xbonacci xbonacci = new Xbonacci();

  @Test
  public void test1() {
    double[] signature = {0, 1};

    assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
        xbonacci.xbonacci(signature, 10));
  }

  @Test
  public void test2() {
    double[] signature = {1, 1};

    assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55},
        xbonacci.xbonacci(signature, 10));
  }

  @Test
  public void test3() {
    double[] signature = {1, 1, 1, 1};

    assertArrayEquals(new double[]{1, 1, 1, 1, 4, 7, 13, 25, 49, 94},
        xbonacci.xbonacci(signature, 10));
  }

  @Test
  public void test4() {
    double[] signature = {0, 0, 0, 0, 1};

    assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16},
        xbonacci.xbonacci(signature, 10));
  }
}