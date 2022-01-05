package codeWars.kyu6.foldAnArray_20200919;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testWhenInputArrayLength0() {
    assertArrayEquals(new int[]{}, Kata.foldArray(new int[]{}, 3));
  }

  @Test
  public void testWhenInputArrayLength6AndFoldCount1() {
    assertArrayEquals(new int[]{7, 7, 7}, Kata.foldArray(new int[]{1, 2, 3, 4, 5, 6}, 1));
  }

  @Test
  public void testWhenInputArrayLength10() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    assertArrayEquals(new int[]{11, 11, 11, 11, 11}, Kata.foldArray(input, 1));
    assertArrayEquals(new int[]{22, 22, 11}, Kata.foldArray(input, 2));
    assertArrayEquals(new int[]{33, 22}, Kata.foldArray(input, 3));
    assertArrayEquals(new int[]{55}, Kata.foldArray(input, 4));
  }
}