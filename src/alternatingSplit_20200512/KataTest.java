package alternatingSplit_20200512;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return hsi  etTi sats! when input string This is a test!, 1")
  public void test1() {
    // Given: Set string and n times
    String givenString = "This is a test!";
    int givenTimes = 1;
    // When: Call encrypt method
    String actual = Kata.encrypt(givenString, givenTimes);
    // Then: should return "hsi  etTi sats!"
    assertEquals("hsi  etTi sats!", actual);
  }

  @Test
  @DisplayName("test should return  Tah itse sits! when input string This is a test!, 3")
  public void test2() {
    // Given: Set string and n times
    String givenString = "This is a test!";
    int givenTimes = 3;
    // When: Call encrypt method
    String actual = Kata.encrypt(givenString, givenTimes);
    // Then: should return " Tah itse sits!"
    assertEquals(" Tah itse sits!", actual);
  }
}