package codeWars.kyu7.alphabeticalAddition_20200917;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {


  @Test
  public void testWhenStringIsEmpty() {
    assertEquals("z", Kata.addLetters(""));
  }

  @Test
  public void testWhenInputOnlyOne() {
    assertEquals("a", Kata.addLetters("a"));
  }

  @Test
  public void testWhenInputIsMoreThan2() {
    assertEquals("f", Kata.addLetters("a", "b", "c"));
  }

  @Test
  public void testWhenSumIsBiggerThanZ() {
    assertEquals("d", Kata.addLetters("y", "b", "c"));
  }
}