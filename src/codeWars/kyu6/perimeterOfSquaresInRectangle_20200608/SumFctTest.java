package codeWars.kyu6.perimeterOfSquaresInRectangle_20200608;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumFctTest {

  @Test
  @DisplayName("test should return 80 when input 5")
  public void test1() {
    // Then: Should return 80
    assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
  }
}