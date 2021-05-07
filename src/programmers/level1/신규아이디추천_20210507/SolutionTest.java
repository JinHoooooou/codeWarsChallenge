package programmers.level1.신규아이디추천_20210507;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    assertThat(solution.solution("...!@BaT#*..y.abcdefghijklm"), is("bat.y.abcdefghi"));
  }

  @Test
  public void test2() {
    assertThat(solution.solution("z-+.^."), is("z--"));
  }

  @Test
  public void test3() {
    assertThat(solution.solution("=.="), is("aaa"));
  }

  @Test
  public void test4() {
    assertThat(solution.solution("123_.def"), is("123_.def"));
  }

  @Test
  public void test5() {
    assertThat(solution.solution("abcdefghijklmn.p"), is("abcdefghijklmn"));
  }
}