package codeWars.mumbling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccumulTest {

  @Test
  public void testWhenParameterStringLengthIs1() {
    //Given
    String given = "a";
    //When
    String actual = Accumul.accum(given);
    //Then
    assertEquals("A", actual);
  }

  @Test
  public void testWhenParameterStringLengthIs2() {
    //Given
    String given = "ab";
    //When
    String actual = Accumul.accum(given);
    //Then
    assertEquals("A-Bb", actual);
  }
}