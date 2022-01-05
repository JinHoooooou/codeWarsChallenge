package codeWars.consecutiveStrings_20200429;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestConsecTest {

  @Test
  public void testShouldReturnEmptyStringWhenInputArrayLength0() {
    // Given: Set string array length 0
    String[] givenArray = new String[]{};
    int selectCount = 0;

    // Then: Should return ""
    assertEquals("", LongestConsec.longestConsec(givenArray, selectCount));
  }

  @Test
  public void testShouldReturnEmptyStringWhenInputArrayLengthIsLessThanK() {
    // Given: Set string array length less than selectCount
    String[] givenArray = new String[]{"abc", "jinho"};
    int selectCount = 5;

    // Then: Should return ""
    assertEquals("", LongestConsec.longestConsec(givenArray, selectCount));
  }

  @Test
  public void testShouldReturnEmptyStringWhenInputKIsLessThan0() {
    // Given: Set selectCount 0
    String[] givenArray = new String[]{"abc", "jinho", "sunho"};
    int selectCount = 0;

    // Then: Should return ""
    assertEquals("", LongestConsec.longestConsec(givenArray, selectCount));
  }

  @Test
  @DisplayName("test Should return \"abigailtheta\"")
  public void testShouldReturnAbigailtheta() {
    // Given: Set array and selectCount 2
    String[] givenArray = new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta",
        "abigail"};
    int selectCount = 2;

    // Then: Should return "abigailtheta"
    assertEquals("abigailtheta", LongestConsec.longestConsec(givenArray, selectCount));
  }

  @Test
  @DisplayName("test Should return \"wlwsasphmxxowiaxujylentrklctozmymu\" ")
  public void testShouldReturnOocccffuucccjjjkkkjyyyeehh() {
    // Given: Set array and selectCount 2
    String[] givenArray = new String[]{"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};
    int selectCount = 2;

    // Then: Should return "wlwsasphmxxowiaxujylentrklctozmymu"
    assertEquals("wlwsasphmxxowiaxujylentrklctozmymu", LongestConsec.longestConsec(givenArray, selectCount));
  }
}