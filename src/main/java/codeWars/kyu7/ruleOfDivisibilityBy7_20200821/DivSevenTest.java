package codeWars.kyu7.ruleOfDivisibilityBy7_20200821;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DivSevenTest {

  @Test
  @DisplayName("test should return [35, 1] when m=371")
  public void test1() {
    assertArrayEquals(new long[]{35, 1}, DivSeven.seven(371));
  }
}