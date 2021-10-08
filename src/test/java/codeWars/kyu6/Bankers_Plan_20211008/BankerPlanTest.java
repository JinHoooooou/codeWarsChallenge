package codeWars.kyu6.Bankers_Plan_20211008;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class BankerPlanTest {

  @Test
  public void testShouldFail() {
    assertThat(BankerPlan.fortune(100000, 1, 9185, 12, 1), is(true));
    assertThat(BankerPlan.fortune(10000, 0, 10000, 2, 0), is(true));
    assertThat(BankerPlan.fortune(9999, 61.816100, 10000, 3, 0), is(false));
  }
}