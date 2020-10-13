package codeWars.kyu7.reverseNumber_20201013;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseNumberTest {

  @Test
  public void testWhenInputIsPositive() {
    assertThat(ReverseNumber.reverse(123), is(321));
  }

  @Test
  public void testWhenInputIsNegative() {
    assertThat(ReverseNumber.reverse(-123), is(-321));
  }

  @Test
  public void testWhenInputIsMultipleOf10() {
    assertThat(ReverseNumber.reverse(1000), is(1));
  }
}