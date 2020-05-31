package rangeExtraction_20200531;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test should return '0-5' when input [0,1,2,3,4,5]")
  public void test1() {
    // Given: Set int array
    int[] given = {0, 1, 2, 3, 4, 5};

    // Then: Should return '0-5'
    assertEquals("0-5", Solution.rangeExtraction(given));
  }
}