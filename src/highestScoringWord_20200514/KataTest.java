package highestScoringWord_20200514;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return taxi when input is man i need a taxi up to ubud")
  public void test1() {
    // Given: Set string
    String given = "man i need a taxi up to ubud";
    // When: call high method
    String actual = Kata.high(given);
    // Then: Should return taxi
    assertEquals("taxi", actual);
  }
}