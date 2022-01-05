package codeWars.kyu7.reverseLetter_20200711;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return ohnij when input=ji1231#%@#%#$n@#h$o")
  public void test1() {
    // Then: Should return ohnij
    assertEquals("ohnij", Kata.reverseLetter("ji1231#%@#%#$n@#h$o"));
  }
}