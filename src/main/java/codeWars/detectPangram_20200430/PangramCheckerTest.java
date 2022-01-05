package codeWars.detectPangram_20200430;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PangramCheckerTest {

  @Test
  public void testShouldFalseWhenNotContainAtoZ() {
    // Given: Set empty string
    String given = "";

    // Then: Should False
    assertFalse(PangramChecker.check(given));
  }

  @Test
  public void testShouldTrueWhenNotContainAtoZ() {
    // Given: Set string contain a ~ z
    String given = "The quick brown fox jumps over the lazy dog.";

    // Then: Should True
    assertTrue(PangramChecker.check(given));
  }
}