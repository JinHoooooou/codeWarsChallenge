package codeWars.kyu6.breakCamelCase_20200611;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return 'camel Casing' when input 'camelCasing'")
  public void test1() {
    // Then: Should return "camel Casing"
    assertEquals("camel Casing", Solution.camelCase("camelCasing"));
  }

  @Test
  @DisplayName("test should return 'Camel Casing Test' when input 'CamelCasingTest'")
  public void test2() {
    // Then: Should return "Camel Casing Test"
    assertEquals("Camel Casing Test", Solution.camelCase("CamelCasingTest"));
  }

  @Test
  @DisplayName("test should return 'camelcasingtest' when input 'camelcasingtest'")
  public void test3() {
    // Then: Should return "camelcasingtest"
    assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"));
  }
}