package codeWars.alternatingSplit_20200512;

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

  @Test
  @DisplayName("test should return input string when times less than 0")
  public void test3() {
    // Given: Set string and n times that times less than 0
    String givenString = "This is a test!";
    int givenTimes = -1;
    // When: Call encrypt method
    String actual = Kata.encrypt(givenString, givenTimes);
    // Then: should return "This is a test"
    assertEquals("This is a test!", actual);
  }

  @Test
  @DisplayName("test should return This is a test! when input hsi  etTi sats!, 1")
  public void test4() {
    // Given: Set string and n times
    String givenString = "hsi  etTi sats!";
    int givenTimes = 1;
    // When: Call encrypt method
    String actual = Kata.decrypt(givenString, givenTimes);
    // Then: should return "This is a test"
    assertEquals("This is a test!", actual);
  }
}