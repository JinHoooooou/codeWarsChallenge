package codeWars.TribonacciSequence_20200329;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class XbonacciTest {
  @Test
  public void testWhen111Start() {
    //Given
    double[] given = {1,1,1};
    int count = 10;
    //When
    double[] actual = Xbonacci.tribonacci(given, count);
    //Then
    assertArrayEquals(new double[]{1,1,1,3,5,9,17,31,57,105}, actual);
  }

  @Test
  public void testWhen001Start() {
    //Given
    double[] given = {0,0,1};
    int count = 10;
    //When
    double[] actual = Xbonacci.tribonacci(given, count);
    //Then
    assertArrayEquals(new double[]{0,0,1,1,2,4,7,13,24,44}, actual);
  }

  @Test
  public void testWhen011Start() {
    //Given
    double[] given = {0,1,1};
    int count = 10;
    //When
    double[] actual = Xbonacci.tribonacci(given, count);
    //Then
    assertArrayEquals(new double[]{0,1,1,2,4,7,13,24,44,81}, actual);
  }


}