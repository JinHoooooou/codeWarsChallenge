package codeWars.reduceButGrow_20200523;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 24 when input [1, 2, 3, 4]")
  public void test1() {
    // Given: Set int array
    int[] given = {1, 2, 3, 4};

    // Then: should return 24
    assertEquals(24, Kata.grow(given));
  }
}