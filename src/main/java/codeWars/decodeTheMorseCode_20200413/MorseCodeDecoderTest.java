package codeWars.decodeTheMorseCode_20200413;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MorseCodeDecoderTest {
  MorseCodeDecoder decoder = new MorseCodeDecoder();

  @Test
  public void testShouldDecodeAlphabet() {
    // Given: Set String one character
    String given = ".-";
    // When: Call decode method
    String actual = decoder.decode(given);
    // Then: Should Return A
    assertEquals("A", actual);
  }

  @Test
  public void testShouldDecodeNumber() {
    // Given: Set String one number
    String given = ".....";
    // When: Call decode method
    String actual = decoder.decode(given);
    // Then: Should Return 5
    assertEquals("5", actual);
  }

  @Test
  public void testShouldDecodeOneWord() {
    // Given: Set String one word
    String given = ".--- .. -. .... --- ....-";
    // When: Call decode method
    String actual = decoder.decode(given);
    // Then: Should Return JINHO4
    assertEquals("JINHO4", actual);
  }

  @Test
  public void testShouldDecodeMoreThan2Words() {
    // Given: Set String one word
    String given = ".--- .. -. .... --- ....-   -... .- -... ---";
    // When: Call decode method
    String actual = decoder.decode(given);
    // Then: Should Return JINHO4 BABO
    assertEquals("JINHO4 BABO", actual);
  }

  @Test
  public void testShouldDeleteUselessSpace() {
    // Given: Set String one word
    String given = " .--- .. -. .... --- ....-   -... .- -... --- ";
    // When: Call decode method
    String actual = decoder.decode(given);
    // Then: Should Return JINHO4 BABO
    assertEquals("JINHO4 BABO", actual);
  }




}