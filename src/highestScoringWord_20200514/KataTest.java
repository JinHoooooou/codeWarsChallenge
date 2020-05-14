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

  @Test
  @DisplayName("test should return volcano when input is what time are we climbing up to the volcano")
  public void test2() {
    // Given: Set string
    String given = "what time are we climbing up to the volcano";
    // When: call high method
    String actual = Kata.high(given);
    // Then: Should return volcano
    assertEquals("volcano", actual);
  }
}