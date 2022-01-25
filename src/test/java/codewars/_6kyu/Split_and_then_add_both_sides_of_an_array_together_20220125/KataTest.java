package codewars._6kyu.Split_and_then_add_both_sides_of_an_array_together_20220125;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    int[] inputArray = {1, 2, 5, 7, 2, 3, 5, 7, 8};
    int inputCount = 1;
    int[] expected = {2, 4, 7, 12, 15};

    assertThat(Kata.splitAndAdd(inputArray, inputCount), is(expected));
  }

  @Test
  public void test2() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int inputCount = 2;
    int[] expected = {5, 10};

    assertThat(Kata.splitAndAdd(inputArray, inputCount), is(expected));
  }

  @Test
  public void test3() {
    int[] inputArray = {1, 2, 3, 4, 5};
    int inputCount = 3;
    int[] expected = {15};

    assertThat(Kata.splitAndAdd(inputArray, inputCount), is(expected));
  }

  @Test
  public void test4() {
    int[] inputArray = {15};
    int inputCount = 3;
    int[] expected = {15};

    assertThat(Kata.splitAndAdd(inputArray, inputCount), is(expected));
  }

  @Test
  public void test5() {
    int[] inputArray = {32, 45, 43, 23, 54, 23, 54, 34};
    int inputCount = 2;
    int[] expected = {183, 125};

    assertThat(Kata.splitAndAdd(inputArray, inputCount), is(expected));
  }
}