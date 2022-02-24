package codewars._6kyu.Positions_Average_20220224;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionAverageTest {

  @Test
  public void test1() {
    assertThat(PositionAverage.posAverage("6900690040, 4690606946, 9990494604"), is(26.6666666667));
  }

  @Test
  public void test2() {
    assertThat(PositionAverage.posAverage(
        "444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"),
        is(29.2592592593));
  }
}