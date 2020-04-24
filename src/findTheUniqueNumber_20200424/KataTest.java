package findTheUniqueNumber_20200424;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 1 when array is {1, 2, 2}")
  public void test1() {
    // Given: Set array first element not same
    double[] given = new double[]{1, 2, 2};
    // When: Call findUniq method
    double actual = Kata.findUniq(given);
    // Then: Should return 1
    assertEquals(1, actual);
  }

  @Test
  @DisplayName("test should return 0.55 when array is {0, 0, 0, 0, 0, 0.55}")
  public void test2() {
    // Given: Set array last element not same
    double[] given = new double[]{0, 0, 0, 0, 0, 0.55};
    // When: Call findUniq method
    double actual = Kata.findUniq(given);
    // Then: Should return 0.55
    assertEquals(0.55, actual);
  }


  @Test
  @DisplayName("test should return 1 when array is {2, 1, 2, 2, 2, 2}")
  public void test3() {
    // Given: Set array length middle element not same
    double[] given = new double[]{2, 1, 2, 2, 2, 2};
    // When: Call findUniq method
    double actual = Kata.findUniq(given);
    // Then: Should return 1
    assertEquals(1, actual);
  }


}