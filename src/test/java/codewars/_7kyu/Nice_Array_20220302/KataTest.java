package codewars._7kyu.Nice_Array_20220302;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.isNice(new Integer[]{1, 2, 3, 4, 5}), is(true));
  }

  @Test
  public void test2() {
    assertThat(Kata.isNice(new Integer[]{5, 4, 3, 2, 1}), is(true));
  }

  @Test
  public void test3() {
    assertThat(Kata.isNice(new Integer[]{1, 3, 5, 2}), is(false));
  }

  @Test
  public void test4() {
    assertThat(Kata.isNice(new Integer[]{10, 10, 2, 2, 3}), is(false));
  }
}