package codeWars.kyu7.collatzConjectureLength_20201010;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CollatzTest {

  @Test
  public void test1() {
    assertThat(Collatz.conjecture(20), is(8L));
  }
}