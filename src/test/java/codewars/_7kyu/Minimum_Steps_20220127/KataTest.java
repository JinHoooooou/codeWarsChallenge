package codewars._7kyu.Minimum_Steps_20220127;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    int[] numbers = {1, 10, 12, 9, 2, 3};
    int k = 6;
    int expected = 2;
    assertThat(Kata.minimumSteps(numbers, k), is(expected));
  }

  @Test
  public void test2() {
    int[] numbers = {8, 9, 4, 2};
    int k = 23;
    int expected = 3;
    assertThat(Kata.minimumSteps(numbers, k), is(expected));
  }

  @Test
  public void test3() {
    int[] numbers = {4, 6, 3};
    int k = 7;
    int expected = 1;
    assertThat(Kata.minimumSteps(numbers, k), is(expected));
  }

  @Test
  public void test4() {
    int[] numbers = {10, 9, 9, 8};
    int k = 17;
    int expected = 1;
    assertThat(Kata.minimumSteps(numbers, k), is(expected));
  }

  @Test
  public void test5() {
    int[] numbers = {19, 98, 69, 28, 75, 45, 17, 98, 67};
    int k = 464;
    int expected = 8;
    assertThat(Kata.minimumSteps(numbers, k), is(expected));
  }
}