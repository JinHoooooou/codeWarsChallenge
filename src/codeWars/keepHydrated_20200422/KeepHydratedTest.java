package codeWars.keepHydrated_20200422;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeepHydratedTest {

  @Test
  public void testShouldReturn0WhenInputLessThan2() {
    // Given: Set double 1
    double given = 0.97;
    // When: Call Liters method
    int actual = KeepHydrated.Liters(given);
    // Then: Should return 0
    assertEquals(0,actual);
  }

  @Test
  public void testShouldReturn1WhenInputMoreThan2AndLessThan4() {
    // Given: Set double 3.4
    double given = 3.4;
    // When: Call Liters method
    int actual = KeepHydrated.Liters(given);
    // Then: Should return 1
    assertEquals(1,actual);
  }

  @Test
  public void testShouldReturn7WhenInputMoreThan14AndLessThan16() {
    // Given: Set double 14.63
    double given = 14.63;
    // When: Call Liters method
    int actual = KeepHydrated.Liters(given);
    // Then: Should return 7
    assertEquals(7,actual);
  }
}