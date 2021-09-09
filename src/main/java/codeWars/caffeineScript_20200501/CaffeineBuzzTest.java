package codeWars.caffeineScript_20200501;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaffeineBuzzTest {

  @Test
  public void testShouldReturnJavaWhenInputDivideBy3() {
    // Then: Should return "Java"
    assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
  }

  @Test
  public void testShouldReturnCoffeeScriptWhenInputDivideBy3And4() {
    // Then: Should return "CoffeeScript"
    assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
  }

  @Test
  public void testShouldReturnJavaScriptWhenInputDivideBy3And4() {
    // Then: Should return "JavaScript"
    assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
  }
}