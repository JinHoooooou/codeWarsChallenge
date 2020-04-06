package bitCounting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitCountingTest {

  @Test
  public void testWithInteger() {
    //Given
    int given = 5;
    //When
    int actual = BitCounting.countBits(given);
    //Then
    assertEquals(2,actual);
  }

}