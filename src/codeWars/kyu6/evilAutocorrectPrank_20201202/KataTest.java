package codeWars.kyu6.evilAutocorrectPrank_20201202;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

  @Test
  public void test_WhenInputIsYou() {
    assertThat(Kata.autocorrect("you"), is("your sister"));
  }

  @Test
  public void test_WhenInputIsYouuuuuuu() {
    assertThat(Kata.autocorrect("youuuuuuuuu"), is("your sister"));
    assertThat(Kata.autocorrect("Youuuuuuuuu"), is("your sister"));
  }

  @Test
  public void test_WhenInputIsI_miss_you() {
    assertThat(Kata.autocorrect("I miss you!"), is("I miss your sister!"));
  }
}