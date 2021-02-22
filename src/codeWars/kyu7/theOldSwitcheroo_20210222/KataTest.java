package codeWars.kyu7.theOldSwitcheroo_20210222;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.vowel2Index("this is my string"), is("th3s 6s my str15ng"));
  }
}