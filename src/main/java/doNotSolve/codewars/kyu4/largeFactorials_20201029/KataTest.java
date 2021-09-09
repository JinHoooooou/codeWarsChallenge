package doNotSolve.codewars.kyu4.largeFactorials_20201029;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.factorial(1), is("1"));
  }

  @Test
  public void test2() {
    assertThat(Kata.factorial(2), is("2"));
  }

  @Test
  public void test3() {
    assertThat(Kata.factorial(5), is("120"));
  }

  @Test
  public void test4() {
    assertThat(Kata.factorial(15), is("1307674368000"));
  }

  @Test
  public void test5() {
    assertThat(Kata.factorial(25), is("15511210043330985984000000"));
  }
}