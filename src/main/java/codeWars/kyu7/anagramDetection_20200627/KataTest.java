package codeWars.kyu7.anagramDetection_20200627;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should true when test=foefet and original=toffee")
  public void test1() {
    // Then: Should true
    assertTrue(Kata.isAnagram("foefet", "toffee"));
  }
}