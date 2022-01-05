package codeWars.kyu4.twiceLinear_20200709;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoubleLinearTest {

  @Test
  @DisplayName("test should return 22 when input 10")
  public void test1() {
    assertEquals(22, DoubleLinear.dblLinear(10));
    assertEquals(57, DoubleLinear.dblLinear(20));
    assertEquals(91, DoubleLinear.dblLinear(30));
  }
}