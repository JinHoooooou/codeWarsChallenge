package codewars._7kyu.Previous_multiple_of_three_20220224;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertNull(Kata.prevMultOfThree(1));
  }

  @Test
  public void test2() {
    assertNull(Kata.prevMultOfThree(25));
  }

  @Test
  public void test3() {
    assertThat(Kata.prevMultOfThree(36), is(36));
  }

  @Test
  public void test4() {
    assertThat(Kata.prevMultOfThree(1244), is(12));
  }

  @Test
  public void test5() {
    assertThat(Kata.prevMultOfThree(952406), is(9));
  }
}