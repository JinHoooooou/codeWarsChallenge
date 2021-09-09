package codeWars.kyu7.toLeetSpeak_20201023;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.toLeetSpeak("LEET"), is("1337"));
  }

  @Test
  public void test2() {
    assertThat(Kata.toLeetSpeak("CODEWARS"), is("(0D3W@R$"));
  }

  @Test
  public void test3() {
    assertThat(Kata.toLeetSpeak("HELLO WORLD"), is("#3110 W0R1D"));
  }

  @Test
  public void test4() {
    assertThat(Kata.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"), is("10R3M !P$UM D010R $!7 @M37"));
  }
}