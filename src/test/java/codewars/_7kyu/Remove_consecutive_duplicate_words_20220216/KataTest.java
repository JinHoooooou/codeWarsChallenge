package codewars._7kyu.Remove_consecutive_duplicate_words_20220216;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
    String expected = "alpha beta gamma delta alpha beta gamma delta";
    assertThat(Kata.removeConsecutiveDuplicates(s), is(expected));
  }
}