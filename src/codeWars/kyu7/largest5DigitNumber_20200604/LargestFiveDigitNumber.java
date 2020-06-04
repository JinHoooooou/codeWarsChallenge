package codeWars.kyu7.largest5DigitNumber_20200604;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestFiveDigitNumber {

  public static int solve(final String digits) {
    String compareString = digits;
    int result = 0;
    while (compareString.length() >= 5) {
      int compareInt = Integer.parseInt(compareString.substring(0, 5));
      result = Math.max(compareInt, result);
      compareString = compareString.substring(1);
    }
    return result;
  }

  @Test
  @DisplayName("test should return 83910 when input '283910")
  public void test1() {
    // Then: Should return 83910
    assertEquals(83910, solve("283910"));
  }

  @Test
  @DisplayName("test should return 67890 when input '1234567890")
  public void test2() {
    // Then: Should return 67890
    assertEquals(67890, solve("1234567890"));
  }
}
