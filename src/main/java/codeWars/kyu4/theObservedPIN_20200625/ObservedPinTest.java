package codeWars.kyu4.theObservedPIN_20200625;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ObservedPinTest {

  @Test
  @DisplayName("test should return [5,7,8,9,0] when input 5")
  public void test_input_length1_1() {
    // Given: Set input
    String observed = "8";
    // Then: Should return [5,7,8,9,0]
    List<String> expected = Arrays.asList("5", "7", "8", "9", "0");
    Collections.sort(expected);
    assertArrayEquals(expected.toArray(), ObservedPin.getPINs(observed).toArray());
  }

  @Test
  @DisplayName("test should return [1,2,3,5] when input 2")
  public void test_input_length1_2() {
    // Given: Set input
    String observed = "2";

    // Then: Should return [1,2,3,5]
    List<String> expected = Arrays.asList("1", "2", "3", "5");
    Collections.sort(expected);
    assertArrayEquals(expected.toArray(), ObservedPin.getPINs(observed).toArray());
  }

  @Test
  @DisplayName("test should return [6,8,9] when input 9")
  public void test_input_length1_3() {
    // Given: Set input
    String observed = "9";

    // Then: Should return [6,8,9]
    List<String> expected = Arrays.asList("6", "8", "9");
    Collections.sort(expected);
    assertArrayEquals(expected.toArray(), ObservedPin.getPINs(observed).toArray());
  }

  @Test
  @DisplayName("test should return [11,12,14,21,22,24,41,42,44] when input 11")
  public void test_input_length2_1() {
    // Given: Set input
    String observed = "11";

    // Then: Should return [11,12,14,21,22,24,41,42,44]
    List<String> expected = Arrays.asList("11","12","14","21","22","24","41","42","44");
    Collections.sort(expected);
    assertArrayEquals(expected.toArray(), ObservedPin.getPINs(observed).toArray());
  }
}