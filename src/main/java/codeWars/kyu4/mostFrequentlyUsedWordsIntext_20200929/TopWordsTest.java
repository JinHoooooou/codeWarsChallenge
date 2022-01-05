package codeWars.kyu4.mostFrequentlyUsedWordsIntext_20200929;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class TopWordsTest {

  @Test
  public void basicTest() {
    String s = "a a a  b  c c  d d d d  e e e e e";
    assertThat(Arrays.asList("e", "d", "a"), is(TopWords.top3(s)));
  }

  @Test
  public void testShouldBeCaseInsensitive() {
    String s = "e e e e DDD ddd DdD ddd ddd aa aA Aa bb cc cC e e e";
    assertThat(TopWords.top3(s), is(Arrays.asList("e", "ddd", "aa")));
  }

  @Test
  public void testWordsShouldNotContainPunctuationExceptApostrophes() {
    String s = "  //wont won't won't ";
    assertThat(TopWords.top3(s), is(Arrays.asList("won't", "wont")));
  }

  @Test
  public void testWhenInputHasManyPunctuationsAndSpaces() {
    String s = "  , e   .. ";
    assertThat(TopWords.top3(s), is(Arrays.asList("e")));
  }

  @Test
  public void testWhenInputHasOnlyPunctuationsAndSpaces() {
    assertThat(TopWords.top3("  ...  "), is(Arrays.asList()));
    assertThat(TopWords.top3("  '  "), is(Arrays.asList()));
    assertThat(TopWords.top3("  '''  "), is(Arrays.asList()));
  }

  @Test
  public void testWhenInputIsLongSentenceContainEnter() {
    String text = Stream
        .of("In a village of La Mancha, the name of which I have no desire to call to",
            "mind, there lived not long since one of those gentlemen that keep a lance",
            "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
            "coursing. An olla of rather more beef than mutton, a salad on most",
            "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
            "on Sundays, made away with three-quarters of his income.")
        .collect(Collectors.joining("\n"));

    assertThat(TopWords.top3(text), is(Arrays.asList("a", "of", "on")));
  }
}