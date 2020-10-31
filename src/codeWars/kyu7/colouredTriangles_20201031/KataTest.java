package codeWars.kyu7.colouredTriangles_20201031;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.triangle("GB"), is('R'));
  }

  @Test
  public void test2() {
    assertThat(Kata.triangle("RRR"), is('R'));
  }

  @Test
  public void test3() {
    assertThat(Kata.triangle("RGBG"), is('B'));
  }

  @Test
  public void test4() {
    assertThat(Kata.triangle("RBRGBRB"), is('G'));
  }

  @Test
  public void test5() {
    assertThat(Kata.triangle("RBRGBRBGGRRRBGBBBGG"), is('G'));
  }

  @Test
  public void test6() {
    assertThat(Kata.triangle("B"), is('B'));
  }
}