package codeWars.kyu7.brokenSequence_20210223;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BrokenSequenceTest {

  @Test
  public void test1() {
    assertThat(BrokenSequence.findMissingNumber("1 2 3 5"), is(4));
  }

  @Test
  public void test2() {
    assertThat(BrokenSequence.findMissingNumber("1 3"), is(2));
  }

  @Test
  public void test3() {
    assertThat(BrokenSequence.findMissingNumber("2 1 4 3 a"), is(1));
  }
}