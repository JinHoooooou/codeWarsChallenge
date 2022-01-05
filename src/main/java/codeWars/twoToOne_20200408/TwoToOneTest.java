package codeWars.twoToOne_20200408;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoToOneTest {

  @Test
  public void testShouldReturnAlphabetSortedStringWhenInputTwoStringIsSame() {
    // Given: Set input same string
    String given1 = "bacedfghikjlmnopqrstuvwxyz";
    String given2 = "bacedfghikjlmnopqrstuvwxyz";
    // When: Call twoToOne method
    String actual = TwoToOne.longest(given1, given2);
    // Then: Should return alphabet sort "abcdefghijklmnopqrstuvwxyz"
    assertEquals("abcdefghijklmnopqrstuvwxyz", actual);
  }

  @Test
  public void testShouldDeleteDuplicateCharacters() {
    // Given: Set input different string
    String given1 = "aretheyhere";
    String given2 = "yestheyarehere";
    // When: Call twoToOne method
    String actual = TwoToOne.longest(given1, given2);
    // Then: Should return alphabet sort "aehrsty"
    assertEquals("aehrsty", actual);
  }

  @Test
  public void test3() {
    // Given: Set input different string
    String given1 = "loopingisfunbutdangerous";
    String given2 = "lessdangerousthancoding";
    // When: Call twoToOne method
    String actual = TwoToOne.longest(given1, given2);
    // Then: Should return alphabet sort "abcdefghilnoprstu"
    assertEquals("abcdefghilnoprstu", actual);
  }




}