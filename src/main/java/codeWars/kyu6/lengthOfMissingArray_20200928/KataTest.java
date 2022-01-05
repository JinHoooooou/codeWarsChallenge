package codeWars.kyu6.lengthOfMissingArray_20200928;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    // Given: Set 2-th array
    Object[][] input = {
        {1, 2},
        {4, 5, 1, 1},
        {1},
        {5, 6, 7, 8, 9}
    };

    assertEquals(3, Kata.getLengthOfMissingArray(input));
  }
}