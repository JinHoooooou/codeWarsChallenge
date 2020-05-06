package reverseWords_20200506;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseWordsTest {

  @Test
  public void testShouldReturnReverseWords() {
    // Given: Set string "This is an example!"
    String given = "This is an example!";

    // Then: Should return "sihT si na !elpmaxe"
    assertEquals("sihT si na !elpmaxe", ReverseWords.reverseWords(given));
  }

  @Test
  public void testShouldRetainAllSpaces() {
    // Given: Set string "double  spaces"
    String given = "double   spaces";

    // Then: Should return "elbuod   secaps"
    assertEquals("elbuod   secaps", ReverseWords.reverseWords(given));
  }

  @Test
  public void testShouldReturnOriginalStringWhenInputIsSpaces() {
    // Given: Set string "   "
    String given = "   ";

    // Then: Should return "   "
    assertEquals("   ", ReverseWords.reverseWords(given));
  }
}