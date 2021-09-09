package programmers.stringZip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should return 2 when input 'aaaaaa'")
  public void test1() {
    // Then: Should return 2, '6a'
    assertEquals(2, solution.solution("aaaaaa"));
  }

  @Test
  @DisplayName("test should return 2 when input 'aabbaccc'")
  public void test2() {
    // Then: Should return 7, '2a2ba3c'
    assertEquals(7, solution.solution("aabbaccc"));
  }

  @Test
  @DisplayName("test should return 9 when input 'ababcdcdababcdcd'")
  public void test3() {
    // Then: Should return 9 '2ababcdcd'
    assertEquals(9, solution.solution("ababcdcdababcdcd"));
  }

  @Test
  @DisplayName("test should return 8 when input 'abcabcdede'")
  public void test4() {
    // Then: Should return 8 '2abcdede'
    assertEquals(8, solution.solution("abcabcdede"));
  }

  @Test
  @DisplayName("test should return 8 when input 'abcabcdede'")
  public void test5() {
    // Then: Should return 8 '2abcdede'
    assertEquals(8, solution.solution("abcabcdede"));
  }

  @Test
  @DisplayName("test should return 14 when input 'abcabcabcabcdededededede'")
  public void test6() {
    // Then: Should return 14 '2abcabc2dedede'
    assertEquals(14, solution.solution("abcabcabcabcdededededede"));
  }

  @Test
  @DisplayName("test should return 17 when input 'xababcdcdababcdcd'")
  public void test7() {
    // Then: Should return 17 'xababcdcdababcdcd'
    assertEquals(17, solution.solution("xababcdcdababcdcd"));
  }
}