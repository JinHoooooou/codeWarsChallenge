package codeWars.kyu4.findTheUnknownDigit_20210114;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RunesTest {

  @Test
  public void test1() {
    assertThat(Runes.solveExpression("1+1=?"), is(2));
  }

  @Test
  public void test2() {
    assertThat(Runes.solveExpression("123*45?=5?088"), is(6));
  }

  @Test
  public void test3() {
    assertThat(Runes.solveExpression("-5?*-1=5?"), is(0));
  }

  @Test
  public void test4() {
    assertThat(Runes.solveExpression("19--45=5?"), is(-1));
  }

  @Test
  public void test5() {
    assertThat(Runes.solveExpression("?*11=??"), is(2));
  }

  @Test
  public void test6() {
    assertThat(Runes.solveExpression("?8?170-1?6256=7?2?14"), is(9));
  }


}