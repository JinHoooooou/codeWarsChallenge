package codeWars.kyu8.removeExclamationMarksInTheSentenceFromLeftToRight_20200723;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test() {
    assertEquals("Hi", Kata.remove("Hi!", 1));
    assertEquals("Hi", Kata.remove("Hi!", 100));
    assertEquals("Hi!!", Kata.remove("Hi!!!", 1));
    assertEquals("Hi", Kata.remove("Hi!!!", 100));
    assertEquals("Hi", Kata.remove("!Hi", 1));
    assertEquals("Hi!", Kata.remove("!Hi!", 1));
    assertEquals("Hi", Kata.remove("!Hi!", 100));
    assertEquals("!!Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 1));
    assertEquals("Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 3));
    assertEquals("Hi hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 5));
    assertEquals("Hi hi hi", Kata.remove("!!!Hi !!hi!!! !hi", 100));
  }
}