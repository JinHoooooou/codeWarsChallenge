package codeWars.kyu7.nthPowerRulesThemAll_20201222;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.modifiedSum(new int[]{1, 2, 3}, 3), is(30));
  }

  @Test
  public void test2() {
    assertThat(Kata.modifiedSum(new int[]{1, 2}, 5), is(30));
  }
}