package doNotSolve.codewars.kyu5.didYouMean;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest {

  @Test
  public void test1() {
    String[] words = {"cherry", "pineapple", "melon", "strawberry", "raspberry"};
    Dictionary dictionary = new Dictionary(words);
    assertThat(dictionary.findMostSimilar("strawbery"), is("strawberry"));
  }
}