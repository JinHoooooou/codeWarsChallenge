package codeWars.CountingDuplicates_20200319;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingDuplicatesTest {

  @Test
  public void testWhenNotDuplicateShouldReturnZero() {
    //Given
    String given = "abcde";
    //When
    int actual = CountingDuplicates.duplicateCount(given);
    //Then
    assertEquals(0, actual);
  }

  @Test
  public void testWhenOnlyOneCharacterDuplicateShouldReturnOne() {
    //Given
    String given = "indivisibility";
    //When
    int actual = CountingDuplicates.duplicateCount(given);
    //Then
    assertEquals(1, actual);
  }

  @Test
  public void testWhenTwoCharacterDuplicateShouldReturnOne() {
    //Given
    String given = "agttbbcde";
    //When
    int actual = CountingDuplicates.duplicateCount(given);
    //Then
    assertEquals(2, actual);
  }

  @Test
  public void testWhenDifferentCaseShouldCaseInsensitive() {
    //Given
    String given = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //When
    int actual = CountingDuplicates.duplicateCount(given);
    //Then
    assertEquals(26, actual);
  }
}