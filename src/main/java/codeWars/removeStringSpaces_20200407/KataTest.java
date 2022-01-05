package codeWars.removeStringSpaces_20200407;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturnOriginalStringWhenInputHasNoSpace() {
    // Given: Set string no has space
    String given = "mynameisleejinho";
    // When: Call noSpace method
    String actual = Kata.noSpace(given);
    // Then: Should return given string
    assertEquals(given, actual);
  }

  @Test
  public void testShouldReturnNoSpaceStringWhenInputHasSpaceButNoConsecutiveSpace() {
    // Given: Set string only one space, not consecutive space
    String given = "my name is lee jin ho";
    // When: Call noSpace method
    String actual = Kata.noSpace(given);
    // Then: Should return given string
    assertEquals("mynameisleejinho", actual);
  }

  @Test
  public void testShouldReturnNoSpaceStringWhenInputHasConsecutiveSpace() {
    // Given: Set string only one space, not consecutive space
    String given = "my   name is lee jin ho";
    // When: Call noSpace method
    String actual = Kata.noSpace(given);
    // Then: Should return given string
    assertEquals("mynameisleejinho", actual);
  }


}