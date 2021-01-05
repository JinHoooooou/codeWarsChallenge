package codeWars.kyu7.numbersInString_20210105;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.solve("2ti9iei7qhr5"), is(9));
  }

  @Test
  public void test2() {
    assertThat(Solution.solve("gh12cdy695m1"), is(695));
  }

  @Test
  public void test3() {
    assertThat(Solution.solve("lu1j8qbbb85"), is(85));
  }

  @Test
  public void test4() {
    assertThat(Solution.solve("185lu1j8qbbb85"), is(185));
  }
}