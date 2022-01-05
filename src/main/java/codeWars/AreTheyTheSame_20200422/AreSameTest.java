package codeWars.AreTheyTheSame_20200422;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AreSameTest {

  @Test
  @DisplayName("배열B 원소가 배열A 원소의 제곱이 아니라면 false를 리턴한다.")
  public void testShouldFalseWhenArrayBNotHasElementOfArrayAElement() {
    // Given: A의 원소 제곱이 아닌 배열 B Set
    int[] givenA = new int[]{2, 2, 3};
    int[] givenB = new int[]{4, 9, 9};

    // Then: Should return false
    assertFalse(AreSame.comp(givenA, givenB));
  }

  @Test
  @DisplayName("배열B 원소가 배열A 원소의 제곱이 맞다면 true를 리턴한다.")
  public void testShouldTrueWhenArrayBIsSquareOfArrayAElement() {
    // Given: A의 원소 제곱 배열 B Set
    int[] givenA = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] givenB = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};

    // Then: Should return true
    assertFalse(AreSame.comp(givenA, givenB));
  }

  @Test
  @DisplayName("배열B나 배열A가 null이라면 false를 리턴한다.")
  public void testShouldfalseWhenArrayBOrArrayAIsNull() {
    // Given: A배열을 null로 set
    int[] givenA = null;
    int[] givenB = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};

    // Then: Should return false
    assertFalse(AreSame.comp(givenA, givenB));
  }
}