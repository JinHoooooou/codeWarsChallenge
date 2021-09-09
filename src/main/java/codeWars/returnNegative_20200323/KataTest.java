package codeWars.returnNegative_20200323;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturn0WhenInput0() {
    //Given : Set input integer 0
    int given = 0;
    //When : Call makeNegative
    int actual = Kata.makeNegative(given);
    //Then : Should return 0
    assertEquals(0, actual);
  }

}