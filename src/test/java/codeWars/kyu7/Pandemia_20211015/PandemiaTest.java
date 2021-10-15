package codeWars.kyu7.Pandemia_20211015;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PandemiaTest {

  @Test
  public void testShouldReturn100() {
    assertThat(Pandemia.infected("111111X111111X111111X"), is(100d));
    assertThat(Pandemia.infected("1"), is(100d));
  }

  @Test
  public void testShouldReturn0() {
    assertThat(Pandemia.infected("00X0X000X"), is(0d));
    assertThat(Pandemia.infected("0"), is(0d));
  }

  @Test
  @DisplayName("test should return 73.33333333333333")
  public void test3() {
    double expected = Pandemia.infected("01000000X000X011X0X");
    assertThat(expected, is(73.33333333333333));
  }

}