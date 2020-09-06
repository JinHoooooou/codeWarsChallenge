package codeWars.kyu7.completeThePattern_20200905;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompleteThePatternTest {

  @Test
  public void testWhenInputIsLessThan1() {
    assertEquals("", CompleteThePattern.pattern(-6));
  }

  @Test
  public void testWhenInputIs2() {
    assertEquals("21\n2", CompleteThePattern.pattern(2));
  }

  @Test
  public void testWhenInputIs5() {
    assertEquals("54321\n5432\n543\n54\n5", CompleteThePattern.pattern(5));
  }
}