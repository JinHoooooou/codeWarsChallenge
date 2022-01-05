package codewars._6kyu.Simple_transposition_20220105;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return \"Sml etapetx\" on input \"Sample text\"")
  public void test1() {
    assertThat(Kata.simpleTransposition("Sample text"), is("Sml etapetx"));
  }

  @Test
  @DisplayName("test should return \"Sml rnpstoipetasoiin\" on input \"Simple transposition\"")
  public void test2() {
    assertThat(Kata.simpleTransposition("Simple transposition"), is("Sml rnpstoipetasoiin"));
  }

  @Test
  @DisplayName("test should return \"Alta ltesi o odl htgitr sntgl\" on input \"All that glitters is not gold\"")
  public void test3() {
    assertThat(Kata.simpleTransposition("All that glitters is not gold"),
        is("Alta ltesi o odl htgitr sntgl"));
  }

  @Test
  @DisplayName("test should return \"Tebte ato ao sdsrtoh etrpr fvlri icein\" on input \"The better part of valor is discretion\"")
  public void test4() {
    assertThat(Kata.simpleTransposition("The better part of valor is discretion"),
        is("Tebte ato ao sdsrtoh etrpr fvlri icein"));
  }
}