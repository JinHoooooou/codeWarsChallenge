package codewars._6kyu.Pair_of_gloves_20220216;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 0 when input is empty string")
  public void test1() {
    String[] gloves = {};
    int expected = 0;
    assertThat(Kata.numberOfPairs(gloves), is(expected));
  }

  @Test
  @DisplayName("test should return 1 when input is {red, red}")
  public void test2() {
    String[] gloves = {"red", "red"};
    int expected = 1;
    assertThat(Kata.numberOfPairs(gloves), is(expected));
  }

  @Test
  @DisplayName("test should return 0 when input is {red, green, blue}")
  public void test3() {
    String[] gloves = {"red", "green", "blue"};
    int expected = 0;
    assertThat(Kata.numberOfPairs(gloves), is(expected));
  }

  @Test
  @DisplayName("test should return 0 when input is {\"gray\", \"black\", \"purple\", \"purple\", \"gray\", \"black\"}")
  public void test4() {
    String[] gloves = {"gray", "black", "purple", "purple", "gray", "black"};
    int expected = 3;
    assertThat(Kata.numberOfPairs(gloves), is(expected));
  }
}