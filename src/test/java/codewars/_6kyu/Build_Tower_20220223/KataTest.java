package codewars._6kyu.Build_Tower_20220223;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    String expected = String.join(",", "*");
    assertThat(String.join(",", Kata.TowerBuilder(1)), is(expected));
  }

  @Test
  public void test2() {
    String expected = String.join(",", " * ", "***");
    assertThat(String.join(",", Kata.TowerBuilder(2)), is(expected));
  }

  @Test
  public void test3() {
    String expected = String.join(",", "  *  ", " *** ", "*****");
    assertThat(String.join(",", Kata.TowerBuilder(3)), is(expected));
  }

  @Test
  public void test4() {
    String expected = String.join(",", "   *   ", "  ***  ", " ***** ", "*******");
    assertThat(String.join(",", Kata.TowerBuilder(4)), is(expected));
  }


}