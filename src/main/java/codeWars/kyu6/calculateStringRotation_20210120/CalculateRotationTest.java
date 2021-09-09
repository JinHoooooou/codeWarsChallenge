package codeWars.kyu6.calculateStringRotation_20210120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateRotationTest {

  @Test
  public void testWhenTwoInputNotMatch() {
    assertThat(CalculateRotation.shiftedDiff("hoop", "pooh"), is(-1));
  }

  @Test
  public void test1() {
    assertThat(CalculateRotation.shiftedDiff("coffee", "eecoff"), is(2));
    assertThat(CalculateRotation.shiftedDiff("eecoff", "coffee"), is(4));
  }
}