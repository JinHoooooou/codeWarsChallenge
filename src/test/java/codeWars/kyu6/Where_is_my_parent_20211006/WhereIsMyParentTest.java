package codeWars.kyu6.Where_is_my_parent_20211006;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WhereIsMyParentTest {

  @Test
  @DisplayName("test should return \"AaBb\" when input \"abBA\"")
  public void test1() {
    assertThat(WhereIsMyParent.findChildren("abBA"), is("AaBb"));
  }

  @Test
  @DisplayName("test should return \"AaaaaaZzzz\" when input \"AaaaaZazzz\"")
  public void test2() {
    assertThat(WhereIsMyParent.findChildren("AaaaaZazzz"), is("AaaaaaZzzz"));
  }

  @Test
  @DisplayName("test should return \"AaBbbCcc\" when input \"CbcBcbaA\"")
  public void test3() {
    assertThat(WhereIsMyParent.findChildren("CbcBcbaA"), is("AaBbbCcc"));
  }

  @Test
  @DisplayName("test should return \"FfUuuuXx\" when input \"xXfuUuuF\"")
  public void test4() {
    assertThat(WhereIsMyParent.findChildren("xXfuUuuF"), is("FfUuuuXx"));
  }

  @Test
  @DisplayName("test should return \"\" when input \"\"")
  public void test5() {
    assertThat(WhereIsMyParent.findChildren(""), is(""));
  }
}