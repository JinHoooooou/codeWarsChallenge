package codeWars.kyu6.binary_to_text_conversion_20210924;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return \"Hello\"")
  public void test1() {
    String binary = "0100100001100101011011000110110001101111";
    assertThat(Solution.binaryToText(binary), is("Hello"));
  }
}