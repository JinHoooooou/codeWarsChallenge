package codeWars.persistenceBurger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersistTest {

  @Test
  public void testWithOneDigitNumberShouldReturnZero() {
    //Given
    int given = 5;
    //When
    int actual = Persist.persistence(given);
    //Then
    assertEquals(0,actual);
  }
  @Test
  public void testWithMoreThanTwoDigitNumber() {
    //Given
    int given = 786;
    //When
    int actual = Persist.persistence(given);
    //Then
    assertEquals(3,actual);
  }



}