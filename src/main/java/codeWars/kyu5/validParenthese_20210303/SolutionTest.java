package codeWars.kyu5.validParenthese_20210303;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.validParentheses("()"), is(true));
    assertThat(Solution.validParentheses("())"), is(false));
    assertThat(Solution.validParentheses("32423(sgsdg)"), is(true));
    assertThat(Solution.validParentheses("(dsgdsg))2432"), is(false));
    assertThat(Solution.validParentheses("adasdasfa"), is(true));
  }
}