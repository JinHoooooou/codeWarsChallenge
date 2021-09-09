package codeWars.kyu6.difference2_20201203;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    int[] array = {1, 2, 3, 4};
    int[][] expected = {{1, 3}, {2, 4}};
    assertThat(Kata.twosDifference(array), is(expected));
  }

  @Test
  public void test2() {
    int[] array = {1, 23, 3, 4, 7};
    int[][] expected = {{1, 3}};
    assertThat(Kata.twosDifference(array), is(expected));
  }

  @Test
  public void test3() {
    int[] array = {4, 3, 1, 5, 6};
    int[][] expected = {{1, 3}, {3, 5}, {4, 6}};
    assertThat(Kata.twosDifference(array), is(expected));
  }
}