package codeWars.convertNumberToReversedArrayOfDigits_20200501;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturnArray795843WhenInputIs348597() {
    // Given: Set input 348597
    long given = 348597;

    // Then: Should return {7, 9, 5, 8, 4, 3}
    assertArrayEquals(new int[]{7, 9, 5, 8, 4, 3}, Kata.digitize(given));
  }
}