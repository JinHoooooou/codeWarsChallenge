package codeWars.kyu8.findFirstNonConsecutiveNumber_20200611;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstNonConsecutiveTest {

  @Test
  @DisplayName("test should return 6 when input [1,2,3,4,6,7]")
  public void test1() {
    // Then: Should return 6
    assertEquals(6, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7}));
  }
}