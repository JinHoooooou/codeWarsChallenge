package codeWars.kyu6.englishBeggars_20201228;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  int[] values = {1, 2, 3, 4, 5};

  @Test
  public void testWhenTurn1() {
    assertThat(Kata.beggars(values, 1), is(new int[]{15}));
  }

  @Test
  public void testWhenTurn2() {
    assertThat(Kata.beggars(values, 2), is(new int[]{9, 6}));
  }

  @Test
  public void testWhenTurn3() {
    assertThat(Kata.beggars(values, 3), is(new int[]{5, 7, 3}));
  }

  @Test
  public void testWhenTurn4() {
    assertThat(Kata.beggars(values, 4), is(new int[]{6, 2, 3, 4}));
  }

  @Test
  public void testWhenTurn6() {
    assertThat(Kata.beggars(values, 6), is(new int[]{1, 2, 3, 4, 5, 0}));
  }
}