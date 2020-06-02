package codeWars.VowelCount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

  @Test
  public void testVowelCountWithOnlySpace() {
    String str = " ";
    int actual = Vowels.getCount(str);
    assertEquals(0, actual);
  }

  @Test
  public void testVowelCountWithStringHasNotVowels() {
    String str = "kkkk";
    int actual = Vowels.getCount(str);
    assertEquals(0, actual);
  }

  @Test
  public void testVowelCountWithStringHasVowels() {
    String str = "jinho";
    int actual = Vowels.getCount(str);
    assertEquals(2, actual);
  }

}