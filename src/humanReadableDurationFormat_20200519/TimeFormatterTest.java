package humanReadableDurationFormat_20200519;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TimeFormatterTest {

  @Test
  @DisplayName("test should return 1 second when input 1")
  public void test1() {
    // Then: Should return 1 second
    assertEquals("1 second", TimeFormatter.formatDuration(1));
  }

  @Test
  @DisplayName("test should return 1 minute and 2 seconds second when input 62")
  public void test2() {
    // Then: Should return 1 minute and 2 seconds
    assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
  }
}