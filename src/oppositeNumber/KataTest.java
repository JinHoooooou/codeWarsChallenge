package oppositeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  public void testMustNegativeInteger(){
    assertEquals(-1, Kata.opposite(1));
    assertEquals(-2, Kata.opposite(2));
    assertEquals(-3, Kata.opposite(3));
    assertEquals(-4, Kata.opposite(4));
    assertEquals(-5, Kata.opposite(5));
  }

}