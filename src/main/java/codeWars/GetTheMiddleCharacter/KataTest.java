package codeWars.GetTheMiddleCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

  private String setWordAndCallGetMiddle(String testing) {
    String word = testing; //testing length is odd or even
    return Kata.getMiddle(word);
  }

  @Test
  public void testShouldReturnMiddleOfOneCharacterWhenStringLengthIsOdd() {
    String actual = setWordAndCallGetMiddle("testing");
    //Then : Return middle one character is "t"
    assertEquals("t", actual);
  }

  @Test
  public void testShouldReturnMiddleOfTwoCharacterWhenStringLengthIsEven() {
    String actual = setWordAndCallGetMiddle("test");
    //Then : Return middle two characters are "es"
    assertEquals("es", actual);
  }
}