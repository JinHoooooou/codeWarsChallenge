package codeWars.duplicateEncoder_20200323;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DuplicateEncoderTest {

  @Test
  public void testShouldReturnOpenWhenAllCharactersAreNotDuplicate() {
    //Given : Set string all characters not duplicate
    String given = "abcdefghi";
    //When
    String actual = DuplicateEncoder.encode(given);
    //Then
    assertEquals("(((((((((", actual);
  }

  @Test
  public void testShouldReturnCloseWhenAllCharactersAreDuplicate() {
    //Given : Set string all characters not duplicate
    String given = "abccbabca";
    //When
    String actual = DuplicateEncoder.encode(given);
    //Then
    assertEquals(")))))))))", actual);
  }

  @Test
  public void testShouldBeCaseInsensitive() {
    //Given : Set string all characters not duplicate
    String given = "Prespecialized";
    //When
    String actual = DuplicateEncoder.encode(given);
    //Then
    assertEquals(")()())()(()()(", actual);
  }

  @Test
  public void testWhenContainOpenAndCloseMark() {
    //Given : Set string all characters not duplicate
    String given = "---()(---";
    //When
    String actual = DuplicateEncoder.encode(given);
    //Then
    assertEquals("))))())))", actual);
  }


}