package codeWars.sentenceSmash_20200523;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmashWordsTest {

  @Test
  @DisplayName("test should return hello world this is great")
  public void test1() {
    // Given: Set String array
    String[] given = {"hello", "world", "this", "is", "great"};

    // When: Call smash method
    String actual = SmashWords.smash(given);

    // Then: should return hello world this is great
    assertEquals("hello world this is great", actual);
  }
}