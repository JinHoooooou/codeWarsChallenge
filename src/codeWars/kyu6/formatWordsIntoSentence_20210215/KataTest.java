package codeWars.kyu6.formatWordsIntoSentence_20210215;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void testShouldReturnEmptyString() {
    assertThat(Kata.formatWords(new String[]{}), is(""));
    assertThat(Kata.formatWords(new String[]{""}), is(""));
    assertThat(Kata.formatWords(null), is(""));
  }

  @Test
  public void test1() {
    String[] input = {"one", "two", "three", "four"};
    assertThat(Kata.formatWords(input), is("one, two, three and four"));
  }

  @Test
  public void test2() {
    String[] input = {"one", "two", "", "three", "four", ""};
    assertThat(Kata.formatWords(input), is("one, two, three and four"));
  }
}