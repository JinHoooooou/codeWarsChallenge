package codeWars.kyu6.playingWithPassphrases_20200906;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayPassTest {

  @Test
  public void testWhenInputIsComposedOfOnlyAlphabet() {
    String input = "MY NAME IS JINHO";

    assertEquals("rKqLm vL HpDq bP", PlayPass.playPass(input, 3));
  }

  @Test
  public void testWhenInputIsComposedOfOnlyDigit() {
    String input = "987 12234 55687";

    assertEquals("21344 56778 210", PlayPass.playPass(input, 3));
  }
}