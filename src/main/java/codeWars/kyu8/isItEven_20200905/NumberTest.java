package codeWars.kyu8.isItEven_20200905;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberTest {

  Number number = new Number();

  @Test
  public void testWhenInputIs1() {
    assertFalse(number.isEven(1));
  }

  @Test
  public void testWhenInputIs4() {
    assertTrue(number.isEven(4));
  }

  @Test
  public void testWhenInputIsNegative() {
    assertTrue(number.isEven(-64));
  }

  @Test
  public void testWhenInputIsFloat() {
    assertFalse(number.isEven(2.2468));
  }
}