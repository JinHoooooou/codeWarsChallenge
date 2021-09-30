package codeWars.kyu6.Srot_the_inner_ctnnoet_in_dsnnieedcg_oredr_20210930;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return \"srot the inner ctonnet in dsnnieedcg oredr\""
      + "when input \"sort the inner content in descending order\"")
  public void test1() {
    String input = "sort the inner content in descending order";
    assertThat(Kata.sortTheInnerContent(input), is("srot the inner ctonnet in dsnnieedcg oredr"));
  }

  @Test
  @DisplayName("test should return \"a\""
      + "when input \"a\"")
  public void test2() {
    String input = "a";
    assertThat(Kata.sortTheInnerContent(input), is("a"));
  }
}