package codeWars.kyu6.ArrayDiff_20210504;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    int[] a = {1, 2};
    int[] b = {1};
    assertThat(Kata.arrayDiff(a, b), is(new int[]{2}));
  }

  @Test
  public void test2() {
    int[] a = {1, 2, 2};
    int[] b = {1};
    assertThat(Kata.arrayDiff(a, b), is(new int[]{2, 2}));
  }

  @Test
  public void test3() {
    int[] a = {1, 2, 2};
    int[] b = {2};
    assertThat(Kata.arrayDiff(a, b), is(new int[]{1}));
  }
}