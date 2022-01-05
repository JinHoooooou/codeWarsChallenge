package codeWars.kyu7.alternateCapitalization_20200619;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return [AbCdE, aBcDe] when input=abcde")
  public void test1() {
    // Then: Should return [AbCdE, aBcDe]
    assertArrayEquals(new String[]{"AbCdE", "aBcDe"}, Solution.capitalize("abcde"));
  }
}