package codeWars.kyu8.isItNumber_20201010;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyUtilitiesTest {

  @Test
  public void testWhenInputIsPositiveInteger() {
    assertThat(new MyUtilities().isDigit("3"), is(true));
    assertThat(new MyUtilities().isDigit("   3   "), is(true));
    assertThat(new MyUtilities().isDigit("3   5"), is(false));
    assertThat(new MyUtilities().isDigit("3-4"), is(false));
  }

  @Test
  public void testWhenInputIsNegativeInteger() {
    assertThat(new MyUtilities().isDigit("-3"), is(true));
    assertThat(new MyUtilities().isDigit("   -3   "), is(true));
    assertThat(new MyUtilities().isDigit("-3   5"), is(false));
    assertThat(new MyUtilities().isDigit("-3-4"), is(false));
  }

  @Test
  public void testWhenInputIsFloat() {
    assertThat(new MyUtilities().isDigit("3.14"), is(true));
    assertThat(new MyUtilities().isDigit("   3   .14  "), is(false));
    assertThat(new MyUtilities().isDigit("-3.23"), is(true));
    assertThat(new MyUtilities().isDigit("-3-4.1234"), is(false));
  }
}