package isMyFriendCheating_20200420;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemovedNumbersTest {

  @Test
  @DisplayName("test should return {15, 21} and {21, 15} when input is 26")
  public void test1() {
    // Given: Set input 26
    long given = 26;
    // When: Call removeNb method
    List<long[]> actual = RemovedNumbers.removeNb(given);
    // Then: Should return {15,21} and {21,15}
    assertArrayEquals(new long[]{15, 21}, actual.get(0));
    assertArrayEquals(new long[]{21, 15}, actual.get(1));
  }
}
