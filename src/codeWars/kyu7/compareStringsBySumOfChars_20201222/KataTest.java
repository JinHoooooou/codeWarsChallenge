package codeWars.kyu7.compareStringsBySumOfChars_20201222;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.compare("AD", "BC"), is(true));
  }

  @Test
  public void test2() {
    assertThat(Kata.compare("AD", "DD"), is(false));
  }

  @Test
  public void test3() {
    assertThat(Kata.compare("gf", "FG"), is(true));
  }

  @Test
  public void test4() {
    assertThat(Kata.compare("zz1", ""), is(true));
  }

  @Test
  public void test5() {
    assertThat(Kata.compare("ZzZz", "ffPFF"), is(true));
  }

  @Test
  public void test6() {
    assertThat(Kata.compare("kl", "lz"), is(false));
  }

  @Test
  public void test7() {
    assertThat(Kata.compare(null, ""), is(true));
  }
}