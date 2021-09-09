package programmers.kakao.문제1번;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    assertThat(solution.solution("one4seveneight"), is(1478));
  }

  @Test
  public void test2() {
    assertThat(solution.solution("23four5six7"), is(234567));
  }

  @Test
  public void test3() {
    assertThat(solution.solution("2three45sixseven"), is(234567));
  }

  @Test
  public void test4() {
    assertThat(solution.solution("123"), is(123));
  }
}