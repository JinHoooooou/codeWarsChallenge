package needleInTheHaystack_20200426;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturnNoArrayLength0() {
    // Given: Set array length 0
    Object[] given = new Object[]{};
    // Then: Should return No
    assertEquals("No", Kata.findNeedle(given));
  }

  @Test
  public void testShouldReturnNoWhenThereIsNotNeedleInArray() {
    // Given: Set array has not contain "needle"
    Object[] given = new Object[]{"3", "123124234", null, "cola", "world", "hay", 2, "3", true,
        false};
    // Then: Should return No
    assertEquals("No", Kata.findNeedle(given));
  }

  @Test
  public void testShouldReturnYesWhenThereIsNeedleInArray() {
    // Given: Set array has not contain "needle"
    Object[] given = new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true,
        false};
    // Then: Should return No
    assertEquals("found the needle at position 3", Kata.findNeedle(given));
  }
}