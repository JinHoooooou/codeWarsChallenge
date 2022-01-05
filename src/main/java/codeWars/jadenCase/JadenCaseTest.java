package codeWars.jadenCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class JadenCaseTest {

  @Test
  public void testWithNullAndEmptyStringShouldReturnNull() {
    //Given
    String given = null;
    //When
    String actual = JadenCase.toJadenCase(given);
    //Then
    assertNull(actual);
  }

  @Test
  public void testWithSentence() {
    //Given
    String given = "most trees are blue";
    //When
    String actual = JadenCase.toJadenCase(given);
    //Then
    assertEquals("Most Trees Are Blue",actual);
  }

}