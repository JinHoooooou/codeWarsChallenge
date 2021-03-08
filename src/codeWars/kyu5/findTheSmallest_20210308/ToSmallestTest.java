package codeWars.kyu5.findTheSmallest_20210308;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ToSmallestTest {

  @Test
  public void test1() {
    assertThat(ToSmallest.smallest(261235L), is(new long[]{126235, 2, 0}));
  }
}