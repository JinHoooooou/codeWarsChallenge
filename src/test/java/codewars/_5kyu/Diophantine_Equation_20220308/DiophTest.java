package codewars._5kyu.Diophantine_Equation_20220308;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiophTest {

  @Test
  public void test1() {
    long n = 5;
    String expected = "[[3, 1]]";
    assertThat(Dioph.solEquaStr(n), is(expected));
  }

  @Test
  public void test2() {
    long n = 13;
    String expected = "[[7, 3]]";
    assertThat(Dioph.solEquaStr(n), is(expected));
  }

  @Test
  public void test3() {
    long n = 16;
    String expected = "[[4, 0]]";
    assertThat(Dioph.solEquaStr(n), is(expected));
  }

  @Test
  public void test4() {
    long n = 90002;
    String expected = "[]";
    assertThat(Dioph.solEquaStr(n), is(expected));
  }
}