package codeWars.kyu7.unluckyDays_20201031;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.unluckyDays(2015), is(3));
  }
}