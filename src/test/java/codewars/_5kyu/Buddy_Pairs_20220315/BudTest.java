package codewars._5kyu.Buddy_Pairs_20220315;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BudTest {

  @Test
  public void test1() {
    long start = 10;
    long limit = 50;
    String expected = "(48 75)";
    assertThat(Bud.buddy(start, limit), is(expected));
  }

  @Test
  public void test2() {
    long start = 1;
    long limit = 2331;
    String expected = "(48 75)";
    assertThat(Bud.buddy(start, limit), is(expected));
  }
}