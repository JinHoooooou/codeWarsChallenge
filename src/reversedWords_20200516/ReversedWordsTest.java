package reversedWords_20200516;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReversedWordsTest {

  @Test
  @DisplayName("test should return \"battle no requires which that is victory greatest The\"")
  public void testShouldFail() {
    // Given: Set string
    String given = "The greatest victory is that which requires no battle";

    // Then: Should return reversed words
    assertEquals("battle no requires which that is victory greatest The",
        ReversedWords.reversedWords(given));
  }
}