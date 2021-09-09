package codeWars.kyu4.romanNumeralsHelper_20210108;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

  @Test
  public void test1() {
    assertThat(RomanNumerals.toRoman(1990), is("MCMXC"));
    assertThat(RomanNumerals.fromRoman("MCMXC"), is(1990));

    assertThat(RomanNumerals.toRoman(2008), is("MMVIII"));
    assertThat(RomanNumerals.fromRoman("MMVIII"), is(2008));
  }

}