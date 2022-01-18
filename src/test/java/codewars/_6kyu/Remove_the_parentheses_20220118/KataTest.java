package codewars._6kyu.Remove_the_parentheses_20220118;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testMySolution() {
    assertThat(Kata.removeParentheses("example(unwanted thing)example"), is("exampleexample"));
    assertThat(Kata.removeParentheses("example (unwanted thing) example"), is("example  example"));
    assertThat(Kata.removeParentheses("a (bc d)e"), is("a e"));
    assertThat(Kata.removeParentheses("a(b(c))"), is("a"));
    assertThat(Kata.removeParentheses("hello example (words(more words) here) something"), is("hello example  something"));
    assertThat(Kata.removeParentheses("KIKK(x(mF)(XlM2sYuZ vK(t)FEU))D((w (a(((())())()wB ))Y)p)(x)i"), is("KIKKDi"));
  }

  @Test
  public void testBestParctice() {
    assertThat(Kata.removeParenthesesBestPractice("KIKK(x(mF)(XlM2sYuZ vK(t)FEU))D((w (a(((())())()wB ))Y)p)(x)i"), is("KIKKDi"));
  }
}