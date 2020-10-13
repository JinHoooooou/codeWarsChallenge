package programmers.level2.문자열내맘대로정렬하기_20201013;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String[] strings = {"sun", "bed", "car"};
    assertThat(new Solution().solution(strings, 1), is(new String[]{"car", "bed", "sun"}));
  }

  @Test
  public void test2() {
    String[] strings = {"abce", "abcd", "cdx"};
    assertThat(new Solution().solution(strings, 2), is(new String[]{"abcd", "abce", "cdx"}));
  }
}