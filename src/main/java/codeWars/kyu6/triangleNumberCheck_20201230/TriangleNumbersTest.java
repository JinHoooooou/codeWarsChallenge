package codeWars.kyu6.triangleNumberCheck_20201230;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleNumbersTest {

  @Test
  public void testWhenInput0Or1() {
    assertThat(TriangleNumbers.isTriangleNumber(0), is(true));
    assertThat(TriangleNumbers.isTriangleNumber(1), is(true));
  }

  @Test
  public void testWhenInput3() {
    assertThat(TriangleNumbers.isTriangleNumber(3), is(true));
  }

  @Test
  public void testWhenInput125250() {
    assertThat(TriangleNumbers.isTriangleNumber(125250), is(true));
  }

  @Test
  public void testWhenInput3126250() {
    assertThat(TriangleNumbers.isTriangleNumber(3126250), is(true));
  }
}