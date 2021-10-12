package codeWars.kyu6.numericals_of_a_string_20211012;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JomoPipiTest {

  @Test
  @DisplayName("test should return 1112111121311 when input Hello, World!")
  public void test1() {
    assertThat(JomoPipi.numericals("Hello, World!"), is("1112111121311"));
  }

  @Test
  @DisplayName("test should return 11121111213112111131224132411122 when input \"Hello, World! It's me, JomoPipi!\"")
  public void test2() {
    assertThat(JomoPipi.numericals("Hello, World! It's me, JomoPipi!"), is("11121111213112111131224132411122"));
  }
}