package codewars._6kyu.collatz_20220121;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollatzTest {

  @Test
  public void test1() {
    assertThat(Collatz.collatz(3), is("3->10->5->16->8->4->2->1"));
  }
}