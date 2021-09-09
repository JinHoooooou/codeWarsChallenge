package codeWars.kyu8.theFeastOfManyBeasts_20200614;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should true when beast=great blue heron, dish=garlic nann")
  public void test1() {
    String beast = "great blue heron";
    String dish = "garlic nann";

    // Then: Should true
    assertTrue(Kata.feast(beast, dish));
  }

  @Test
  @DisplayName("test should true when beast=brown bear, dish=bear claw")
  public void test2() {
    String beast = "brown bear";
    String dish = "bear claw";

    // Then: Should false
    assertFalse(Kata.feast(beast, dish));
  }
}