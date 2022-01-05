package codeWars.stringEndsWith_20200505;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldTrueWhenInputAbcAndEndingBc() {
    // Given: Set base string abc and ending bc
    String givenString = "abc";
    String givenEnding = "bc";

    // Then: Should true
    assertTrue(Kata.solution(givenString, givenEnding));
  }
}