package codeWars.kyu6.consonantValue_20200923;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsonantValueTest {

  @Test
  public void testWhenStringNotContainVowel() {
    assertEquals(10, ConsonantValue.solve("bdd"));
  }

  @Test
  public void testWhenStringOnlyVowel() {
    assertEquals(0, ConsonantValue.solve("aeiou"));
  }

  @Test
  public void testWhenStringContainBothOfConsonantAndVowel() {
    assertEquals(26, ConsonantValue.solve("zodiacs"));
  }
}