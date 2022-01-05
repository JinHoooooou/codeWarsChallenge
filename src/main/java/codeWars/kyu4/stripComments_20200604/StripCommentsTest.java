package codeWars.kyu4.stripComments_20200604;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StripCommentsTest {

  @Test
  public void test1() {
    // Given: Set input
    String text = "apples, pears # and bananas";
    String[] commentsSymbols = {"#"};

    // Then: Should return "apples, pears"
    assertEquals("apples, pears", StripComments.stripComments(text, commentsSymbols));
  }

  @Test
  public void test2() {
    // Given: Set input
    String text = "apples, pears # and bananas\ngrapes\nbananas #apples";
    String[] commentsSymbols = {"#"};

    assertEquals("apples, pears\ngrapes\nbananas",
        StripComments.stripComments(text, commentsSymbols));
  }

  @Test
  public void test3() {
    // Given: Set input
    String text = "apples, pears # and bananas\ngrapes\nbananas !apples";
    String[] commentsSymbols = {"#", "!"};

    assertEquals("apples, pears\ngrapes\nbananas",
        StripComments.stripComments(text, commentsSymbols));
  }
}