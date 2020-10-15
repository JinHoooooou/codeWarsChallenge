package codeWars.kyu7.sortOutTheManFromBoys_20201015;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void testWhenInputContainOnlyOdd() {
    assertThat(Kata.menFromBoys(new int[]{7, 17, 3, 95, 43, 15, 1}),
        is(new int[]{95, 43, 17, 15, 7, 3, 1}));
  }

  @Test
  public void testWhenInputContainOnlyEven() {
    assertThat(Kata.menFromBoys(new int[]{7, 3, 14, 17}),
        is(new int[]{14, 17, 7, 3}));
  }

  @Test
  public void testShouldNotContainDuplicate() {
    assertThat(Kata.menFromBoys(new int[]{2, 15, 17, 15, 2, 10, 10, 17, 1, 1}),
        is(new int[]{2, 10, 17, 15, 1}));
  }

  @Test
  public void testWhenInputContainBoth() {
    assertThat(Kata.menFromBoys(new int[]{2, 14, 90, 10, 100, 76, 50, 20}),
        is(new int[]{2, 10, 14, 20, 50, 76, 90, 100}));
  }

  @Test
  public void testWhenInputIsNegative() {
    assertThat(Kata.menFromBoys(new int[]{-32,-39,-35,-41}),
        is(new int[]{-32,-35,-39,-41}));
  }
}