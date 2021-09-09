package codeWars.stopGninnipsMySdrow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpinWordsTest {

  @Test
  public void testWithLessThanLength4WordsShouldNotReverseWords() {
    //Given
    String given = "This is a test";
    //When
    String actual = SpinWords.spinWords(given);
    //Then
    assertEquals("This is a test", actual);
  }

  @Test
  public void testWithMoreThanLength5WordsShouldReverseWord() {
    //Given
    String given = "Welcome";
    //When
    String actual = SpinWords.spinWords(given);
    //Then
    assertEquals("emocleW", actual);
  }
}