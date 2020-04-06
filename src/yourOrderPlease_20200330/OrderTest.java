package yourOrderPlease_20200330;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

  @Test
  public void testShouldReturnEmptyStringWhenInputIsEmptyString() {
    // Given: Set string number empty
    String given = "Empty input should return empty string";
    // When: Call order method
    String actual = Order.order(given);
    // Then: Should return empty string
    assertEquals("", actual);
  }

  @Test
  public void testShouldReturnNumberOrderIs1234WhenInputOrder2143() {
    // Given: Set string 2-1-4-3 order
    String given = "is2 Thi1s T4est 3a";
    // When: Call order method
    String actual = Order.order(given);
    // Then: Should return 1-2-3-4 order string
    assertEquals("Thi1s is2 3a T4est", actual);
  }

  @Test
  public void testShouldReturnNumberOrderIs1357WhenInputOrder3715() {
    // Given: Set string 3-7-1-5 order
    String given = "is3 Thi7s T1est 5a";
    // When: Call order method
    String actual = Order.order(given);
    // Then: Should return 1-2-3-4 order string
    assertEquals("T1est is3 5a Thi7s", actual);
  }


}