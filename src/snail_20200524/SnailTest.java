package snail_20200524;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SnailTest {

  @Test
  @DisplayName("test when array length 1")
  public void test1() {
    // Given: set 2d array
    int[][] given = {{1}};

    // When: Call snail method
    int[] actual = Snail.snail(given);

    // Then: Should return {1}
    assertArrayEquals(new int[]{1}, actual);
  }

  @Test
  @DisplayName("test when array length 2")
  public void test2() {
    // Given: set 2d array
    int[][] given = {
        {1, 2},
        {3, 4}};

    // When: Call snail method
    int[] actual = Snail.snail(given);

    // Then: Should return {1,2,4,3}
    assertArrayEquals(new int[]{1, 2, 4, 3}, actual);
  }

  @Test
  @DisplayName("test when array length 3")
  public void test3() {
    // Given: set 2d array
    int[][] given = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    // When: Call snail method
    int[] actual = Snail.snail(given);

    // Then: Should return {1,2,3,6,9,8,7,4,5}
    assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, actual);
  }

  @Test
  @DisplayName("test when array length 4")
  public void test4() {
    // Given: set 2d array
    int[][] given = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

    // When: Call snail method
    int[] actual = Snail.snail(given);

    // Then: Should return {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10}
    assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, actual);
  }
}