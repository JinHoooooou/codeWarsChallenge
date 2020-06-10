package programmers.exchangeBracket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test should \"(()())()\" when input \"(()())()\"")
  public void test0() {
    // Then: Should return "(()())()"
    assertEquals("(()())()", solution.solution("(()())()"));
  }


  @Test
  @DisplayName("test should empty string when input empty string")
  public void test1() {
    // Then: Should return ""
    assertEquals("", solution.solution(""));
  }

  @Test
  @DisplayName("test should \"()\" when input \")(\"")
  public void test2() {
    // Then: Should return "()"
    assertEquals("()", solution.solution(")("));
  }

  @Test
  @DisplayName("test should \"()(())()\" when input \"()))((()\"")
  public void test3() {
    // Then: Should return "()(())()"
    assertEquals("()(())()", solution.solution("()))((()"));
  }


}