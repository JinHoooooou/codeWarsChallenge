package codeWars.kyu6.encryptThis_20200820;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test when input is empty string")
  public void test1() {
    // Given: Set input
    String text = "";

    // Then: Should return empty string
    assertEquals("", Kata.encryptThis(text));
  }

  @Test
  @DisplayName("test when input is one word")
  public void test2() {
    // Given: Set input
    String text = "Encrypt";

    // Then: Should return "69tcrypn"
    assertEquals("69tcrypn", Kata.encryptThis(text));
  }

  @Test
  @DisplayName("test when input is more than one word")
  public void test3() {
    // Given: Set input
    String text = "A wise old owl lived in an oak";

    // Then: Should return "65 119esi 111dl 111lw 108dvei 105n 97n 111ka"
    assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Kata.encryptThis(text));
  }
}