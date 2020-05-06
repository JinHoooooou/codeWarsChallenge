package splitStrings_20200506;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringSplitTest {

  @Test
  @DisplayName("test should return {ab,cd,ef} when input \"abcdef\" ")
  public void test1() {
    // Given: Set string "abcdef"
    String given = "abcdef";

    // Then: Should return {ab, cd, ef}
    assertArrayEquals(new String[]{"ab", "cd", "ef"}, StringSplit.solution(given));
  }

  @Test
  @DisplayName("test should return {ab,cd,e_} when input \"abcdef\" ")
  public void test2() {
    // Given: Set string "abcde"
    String given = "abcde";

    // Then: Should return {ab, cd, e_}
    assertArrayEquals(new String[]{"ab", "cd", "e_"}, StringSplit.solution(given));
  }
}