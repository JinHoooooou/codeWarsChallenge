package codewars._7kyu.Reverse_the_bits_in_an_integer_20220125;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;


class BitsOfIntegerTest {

  @Test
  public void test1() {
    assertThat(BitsOfInteger.reverse_bits(417), is(267));
    assertThat(BitsOfInteger.reverse_bits(267), is(417));
  }

  @Test
  public void test2() {
    assertThat(BitsOfInteger.reverse_bits(0), is(0));
  }

  @Test
  public void test3() {
    assertThat(BitsOfInteger.reverse_bits(2017), is(1087));
    assertThat(BitsOfInteger.reverse_bits(1087), is(2017));
  }

  @Test
  public void test4() {
    assertThat(BitsOfInteger.reverse_bits(1023), is(1023));
  }

  @Test
  public void test5() {
    assertThat(BitsOfInteger.reverse_bits(1024), is(1));
  }
}