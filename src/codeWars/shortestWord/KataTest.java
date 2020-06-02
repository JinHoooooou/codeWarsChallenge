package codeWars.shortestWord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  public void testWhenParameterIsOneWord() {
    //Given
    String given = "bitcoin";
    //When
    int actual = Kata.findShort(given);
    //Then
    assertEquals(7, actual);
  }

  @Test
  public void testWhenParameterIsMoreThanTwoWords() {
    //Given
    String given = "bitcoin take over the world maybe who knows perhaps";
    //When
    int actual = Kata.findShort(given);
    //Then
    assertEquals(3, actual);
  }

}