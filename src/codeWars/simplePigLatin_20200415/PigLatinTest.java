package codeWars.simplePigLatin_20200415;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

  @Test
  public void testShouldReturnJustAddStringAyWhenInputOneLetter() {
    // Given: Set string one letter not punctuation
    String given = "j";
    // When: Call pigIt method
    String actual = PigLatin.pigIt(given);
    // Then: Should return "jay"
    assertEquals("jay", actual);
  }

  @Test
  public void testShouldLeavePunctuation() {
    // Given: Set string one punctuation
    String given = "!";
    // When: Call pigIt method
    String actual = PigLatin.pigIt(given);
    // Then: Should return "jay"
    assertEquals("!", actual);
  }

  @Test
  public void testShouldMoveFirstLetterToEndOfWordAndAddAyWhenInputIsMoreThanTwoLetters() {
    // Given: Set string one word
    String given = "jinho";
    // When: Call pigIt method
    String actual = PigLatin.pigIt(given);
    // Then: Should return "inhojay"
    assertEquals("inhojay", actual);
  }

  @Test
  public void testShouldMoveFirstLetterToEndOfEachWordAndAddAyWhenInputIsMoreThanTwoWords() {
    // Given: Set string three words not contain punctuation
    String given = "jinho is king";
    // When: Call pigIt method
    String actual = PigLatin.pigIt(given);
    // Then: Should return "inhojay siay ingkay"
    assertEquals("inhojay siay ingkay", actual);
  }

  @Test
  public void testShouldMoveFirstLetterToEndOfEachWordAndAddAyButLeavePunctuationWhenInputIsMoreThanTwoWordsAndContainPunctuation() {
    // Given: Set string three words not contain punctuation
    String given = "jinho is king !";
    // When: Call pigIt method
    String actual = PigLatin.pigIt(given);
    // Then: Should return "inhojay siay ingkay"
    assertEquals("inhojay siay ingkay !", actual);
  }


}