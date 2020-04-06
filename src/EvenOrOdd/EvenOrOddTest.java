package EvenOrOdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

  @Test
  public void testEvenNumber() {
    assertEquals("Even", EvenOrOdd.even_or_odd(4));
  }

  @Test
  public void testOddNumber() {
    assertEquals("Odd", EvenOrOdd.even_or_odd(3));
  }

}