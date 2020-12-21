package codeWars.kyu6.pascalsTriangle_20201221;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PascalsTriangleTest {

  @Test
  public void testWhenInput1() {
    assertThat(PascalsTriangle.generate(1), is(new long[]{1}));
  }

  @Test
  public void testWhenInput2() {
    assertThat(PascalsTriangle.generate(2), is(new long[]{1, 1, 1}));
  }

  @Test
  public void testWhenInput3() {
    assertThat(PascalsTriangle.generate(3), is(new long[]{1, 1, 1, 1, 2, 1}));
  }

  @Test
  public void testWhenInput4() {
    assertThat(PascalsTriangle.generate(4), is(new long[]{1, 1, 1, 1, 2, 1, 1, 3, 3, 1}));
  }

  @Test
  public void testWhenInput5() {
    assertThat(PascalsTriangle.generate(5),
        is(new long[]{1, 1, 1, 1, 2, 1, 1, 3, 3, 1, 1, 4, 6, 4, 1}));
  }
}