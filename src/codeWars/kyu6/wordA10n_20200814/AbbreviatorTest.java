package codeWars.kyu6.wordA10n_20200814;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbbreviatorTest {

  Abbreviator abbreviator = new Abbreviator();

  @Test
  @DisplayName("test when no hyphen or space")
  public void test1() {
    assertEquals("i18n", abbreviator.abbreviate("internationalization"));
  }

  @Test
  @DisplayName("test when there is space")
  public void test2() {
    assertEquals("e6t r3s are r4y fun", abbreviator.abbreviate("elephant rides are really fun"));
  }

  @Test
  @DisplayName("test when there are spaces and special characters")
  public void test3() {
    assertEquals("e6t-r3s are r4y fun!", abbreviator.abbreviate("elephant-rides are really fun!"));
  }

  @Test
  @DisplayName("test when there are many special characters")
  public void test4() {
    assertEquals("a5d4e-b6d_b5n, on. b5n'a5d4e-b6d_is_sat5a", abbreviator
        .abbreviate("a5double-barreled_balloon, on. balloon'a5double-barreled_is_sat5a"));
  }

  @Test
  @DisplayName("test when there are many special characters")
  public void test5() {
    assertEquals("cat5sat; the-s2s_cat. cat", abbreviator.abbreviate("cat5sat; the-sits_cat. cat"));
  }
}