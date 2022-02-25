package codewars._6kyu.Longest_alphabetical_substring_20220225;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class StringHandlingTest {

  @Test
  public void test1() {
    String text = "asdfaaaabbbbcttavvfffffdf";
    String expected = "aaaabbbbctt";
    assertThat(StringHandling.longestAlpabeticalSubstring(text), is(expected));
  }

  @Test
  public void test2() {
    String text = "asd";
    String expected = "as";
    assertThat(StringHandling.longestAlpabeticalSubstring(text), is(expected));
  }

  @Test
  public void test3() {
    String text = "nab";
    String expected = "ab";
    assertThat(StringHandling.longestAlpabeticalSubstring(text), is(expected));
  }

  @Test
  public void test4() {
    String text = "abcdeapbcdef";
    String expected = "abcde";
    assertThat(StringHandling.longestAlpabeticalSubstring(text), is(expected));
  }

  @Test
  public void test5() {
    String text = "a";
    String expected = "a";
    assertThat(StringHandling.longestAlpabeticalSubstring(text), is(expected));
  }
}