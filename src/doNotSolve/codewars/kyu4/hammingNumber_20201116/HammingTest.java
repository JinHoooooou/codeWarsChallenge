package doNotSolve.codewars.kyu4.hammingNumber_20201116;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class HammingTest {

  @Test
  public void test1To20() {
    assertThat(HammingSolution.hamming(1), is(1L));
    assertThat(HammingSolution.hamming(2), is(2L));
    assertThat(HammingSolution.hamming(3), is(3L));
    assertThat(HammingSolution.hamming(4), is(4L));
    assertThat(HammingSolution.hamming(5), is(5L));
    assertThat(HammingSolution.hamming(6), is(6L));
    assertThat(HammingSolution.hamming(7), is(8L));
    assertThat(HammingSolution.hamming(8), is(9L));
    assertThat(HammingSolution.hamming(9), is(10L));
    assertThat(HammingSolution.hamming(10), is(12L));
    assertThat(HammingSolution.hamming(11), is(15L));
    assertThat(HammingSolution.hamming(12), is(16L));
    assertThat(HammingSolution.hamming(13), is(18L));
    assertThat(HammingSolution.hamming(14), is(20L));
    assertThat(HammingSolution.hamming(15), is(24L));
    assertThat(HammingSolution.hamming(16), is(25L));
    assertThat(HammingSolution.hamming(17), is(27L));
    assertThat(HammingSolution.hamming(18), is(30L));
    assertThat(HammingSolution.hamming(19), is(32L));
    assertThat(HammingSolution.hamming(20), is(36L));
  }


}