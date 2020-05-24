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
}