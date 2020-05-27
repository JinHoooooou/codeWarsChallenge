package camelCaseMethod_20200527;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return 'HelloCase' when input 'hello case'")
  public void test1() {
    // Given: Set String
    String given = "hello case";

    // Then: should return HelloCase
    assertEquals("HelloCase", Solution.camelCase(given));
  }
}