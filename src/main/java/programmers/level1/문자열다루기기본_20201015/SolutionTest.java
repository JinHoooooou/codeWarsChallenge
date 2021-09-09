package programmers.level1.문자열다루기기본_20201015;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInputLength4AndOnlyNumber() {
    assertTrue(new Solution().solution("1234"));
  }

  @Test
  public void testWhenInputLength5AndOnlyNumber() {
    assertFalse(new Solution().solution("12345"));
  }

  @Test
  public void testWhenInputLength6AndOnlyNumber() {
    assertTrue(new Solution().solution("123456"));
  }

  @Test
  public void testWhenInputLength4AndContainAlphabet() {
    assertFalse(new Solution().solution("a234"));
  }
}