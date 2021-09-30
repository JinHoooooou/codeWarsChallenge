package codeWars.kyu7.Last_Survivor_20210930;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return b when input zbk and {0,1}")
  public void test1() {
    assertThat("b", is(Kata.lastSurvivor("zbk", new int[]{0, 1})));
  }
}