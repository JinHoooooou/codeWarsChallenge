package writeNumberInExpandedForm_20200513;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 10 + 2 when input is 12")
  public void test1() {
    // Then: should return 10 + 2
    assertEquals("10 + 2", Kata.expandedForm(12));
  }
}