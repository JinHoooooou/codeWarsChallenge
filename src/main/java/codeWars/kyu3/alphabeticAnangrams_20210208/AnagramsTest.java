package codeWars.kyu3.alphabeticAnangrams_20210208;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Test;

public class AnagramsTest {

  @Test
  public void test1() {
    assertThat(new Anagrams().listPosition("BAAA"), is(BigInteger.valueOf(4)));
  }

  @Test
  public void test2() {
    assertThat(new Anagrams().listPosition("A"), is(BigInteger.valueOf(1)));
  }

  @Test
  public void test3() {
    assertThat(new Anagrams().listPosition("ABAB"), is(BigInteger.valueOf(2)));
  }

  @Test
  public void test4() {
    assertThat(new Anagrams().listPosition("QUESTION"), is(BigInteger.valueOf(24572)));
  }

  @Test
  public void test5() {
    assertThat(new Anagrams().listPosition("BOOKKEEPER"), is(BigInteger.valueOf(10743)));
  }
}