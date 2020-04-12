package countingSheep_20200412;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

  @Test
  public void testShouldCountTrueInInputBooleanArrays() {
    // Given: Set arrays of boolean true count 17
    Boolean[] given = {true, true, true, false,
        true, true, true, true,
        true, false, true, false,
        true, false, false, true,
        true, true, true, true,
        false, false, true, true};

    // When: Call countSheep method
    int actual = Counter.countSheeps(given);

    // Then: Should return 17
    assertEquals(17, actual);
  }

  @Test
  public void testShouldCheckNull() {
    // Given: Set arrays of boolean true count 17
    Boolean[] given = {true, true, true, null,
        true, true, true, true,
        true, false, true, false,
        true, false, false, true,
        true, true, true, true,
        false, false, true, true};

    // When: Call countSheep method
    int actual = Counter.countSheeps(given);

    // Then: Should return 17
    assertEquals(17, actual);
  }

}