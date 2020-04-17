package humanReadableTime_20200417;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HumanReadableTimeTest {

  @Test
  public void testShouldReturnNullWhenInputIsNegativeInteger() {
    // Given: Set negative integer
    int given = -3;
    // When: Call makeReadable method
    String actual = HumanReadableTime.makeReadable(given);
    // Then: Should return null
    assertEquals(null, actual);
  }

  @Test
  public void testShouldReturn59SecondsWhenInputIs59() {
    // Given: Set negative integer
    int given = 59;
    // When: Call makeReadable method
    String actual = HumanReadableTime.makeReadable(given);
    // Then: Should return "00:00:59"
    assertEquals("00:00:59", actual);
  }

  @Test
  public void testShouldReturn1MinuteAnd40SecondsWhenInputIs100() {
    // Given: Set negative integer
    int given = 100;
    // When: Call makeReadable method
    String actual = HumanReadableTime.makeReadable(given);
    // Then: Should return "00:01:40"
    assertEquals("00:01:40", actual);
  }

  @Test
  public void testShouldReturn23HoursAnd59MinutesAnd59SecondsWhenInputIs86399() {
    // Given: Set negative integer
    int given = 86399;
    // When: Call makeReadable method
    String actual = HumanReadableTime.makeReadable(given);
    // Then: Should return "23:59:59"
    assertEquals("23:59:59", actual);
  }

  @Test
  public void testShouldReturn99HoursAnd59MinutesAnd59SecondsWhenInputIs359999() {
    // Given: Set negative integer
    int given = 359999;
    // When: Call makeReadable method
    String actual = HumanReadableTime.makeReadable(given);
    // Then: Should return "99:59:59"
    assertEquals("99:59:59", actual);
  }

}