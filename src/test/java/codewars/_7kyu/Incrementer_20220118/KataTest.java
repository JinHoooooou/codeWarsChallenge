package codewars._7kyu.Incrementer_20220118;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.incrementer(new int[]{1, 2, 3}), is(new int[]{2, 4, 6}));
    assertThat(Kata.incrementer(new int[]{4, 6, 9, 1, 3}), is(new int[]{5, 8, 2, 5, 8}));
  }
}