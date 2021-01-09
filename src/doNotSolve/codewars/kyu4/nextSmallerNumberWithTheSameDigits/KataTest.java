package doNotSolve.codewars.kyu4.nextSmallerNumberWithTheSameDigits;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void testWhenInputValueIsSmallestWithTheSameDigits() {
    assertThat(Kata.nextSmaller(9), is(-1L));
    assertThat(Kata.nextSmaller(111), is(-1L));
    assertThat(Kata.nextSmaller(135), is(-1L));
  }

  @Test
  public void testWhenInputDigitsLengthIs2() {
    assertThat(Kata.nextSmaller(21), is(12L));
    assertThat(Kata.nextSmaller(13), is(-1L));
    assertThat(Kata.nextSmaller(99), is(-1L));
    assertThat(Kata.nextSmaller(91), is(19L));
  }

  @Test
  public void testWhenInputDigitsLengthIs3() {
    assertThat(Kata.nextSmaller(931), is(913L));
    assertThat(Kata.nextSmaller(508), is(-1L));
    assertThat(Kata.nextSmaller(694), is(649L));
    assertThat(Kata.nextSmaller(725), is(572L));
  }

  @Test
  public void testWhenInputDigitsLengthIs4() {
    assertThat(Kata.nextSmaller(4236), is(3642L));
    assertThat(Kata.nextSmaller(3429), is(3294L));
    assertThat(Kata.nextSmaller(8012), is(2810L));
    assertThat(Kata.nextSmaller(1027), is(-1L));
  }

  @Test
  public void testWhenInputDigitsLengthIsLargerThan5() {
    assertThat(Kata.nextSmaller(4236), is(3642L));
    assertThat(Kata.nextSmaller(3429), is(3294L));
    assertThat(Kata.nextSmaller(8012), is(2810L));
    assertThat(Kata.nextSmaller(1027), is(-1L));
  }
}