package codeWars.deleteOccurrencesOfElement_20200502;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EnoughIsEnoughTest {

  @Test
  public void testShouldEmptyArrayWhenInputArrayIsEmptyRegardlessOfMaxOccurrences() {
    // Given: Set empty array and maxOccurrences
    int[] givenArray = new int[]{};
    int givenMaxOccurrences = 5;

    // Then: Should Return empty array regardless maxOccurrences
    assertArrayEquals(givenArray, EnoughIsEnough.deleteNth(givenArray, givenMaxOccurrences));
  }

  @Test
  @DisplayName("test should return {20, 37, 21} when input is {20, 37, 20, 21} and 1")
  public void test1() {
    // Given: Set array {20, 37, 20, 21} and maxOccurrences 1
    int[] givenArray = new int[]{20, 37, 20, 21};
    int givenMaxOccurrences = 1;

    // Then: Should Return {20, 37, 21}
    assertArrayEquals(new int[]{20, 37, 21},
        EnoughIsEnough.deleteNth(givenArray, givenMaxOccurrences));
  }

  @Test
  @DisplayName("test should return {1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5}"
      + " when input is {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1} and 3")
  public void test2() {
    // Given: Set array {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1} and maxOccurrences 3
    int[] givenArray = new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
    int givenMaxOccurrences = 3;

    // Then: Should Return {1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5}
    assertArrayEquals(new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
        EnoughIsEnough.deleteNth(givenArray, givenMaxOccurrences));
  }


}