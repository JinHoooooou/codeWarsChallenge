package codewars._7kyu.Changing_letters_20220321;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    String input = "HelloWorld!";
    String expected = "HEllOWOrld!";

    assertThat(Kata.swap(input), is(expected));
  }
}