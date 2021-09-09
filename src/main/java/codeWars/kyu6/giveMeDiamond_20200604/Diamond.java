package codeWars.kyu6.giveMeDiamond_20200604;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Diamond {

  StringBuilder output;

  @BeforeEach
  public void setUp() {
    output = new StringBuilder();
  }

  @Test
  public void testWhenInput1() {
    // Given: Set output string
    output.append("*\n");

    // Then: should return output String
    assertEquals(output.toString(), print(1));
  }

  @Test
  public void testWhenInput3() {
    // Given: Set output string
    output.append(" *\n");
    output.append("***\n");
    output.append(" *\n");

    // Then: should return output String
    assertEquals(output.toString(), print(3));
  }

  @Test
  public void testWhenInput5() {
    // Given: Set output string
    output.append("  *\n");
    output.append(" ***\n");
    output.append("*****\n");
    output.append(" ***\n");
    output.append("  *\n");
    // Then: should return output String
    assertEquals(output.toString(), print(5));
  }

  public static String print(int n) {
    if (n < 0 || n % 2 == 0) {
      return null;
    }
    StringBuilder result = new StringBuilder();

    for (int i = 0, j = n / 2, k = 1; i < n / 2; i++, j--, k += 2) {
      for (int l = 0; l < j; l++) {
        result.append(" ");
      }
      for (int l = 0; l < k; l++) {
        result.append("*");
      }
      result.append("\n");
    }

    for (int l = 0; l < n; l++) {
      result.append("*");
    }
    result.append("\n");

    for (int i = 0, j = 1, k = n - 2; i < n / 2; i++, j++, k -= 2) {
      for (int l = 0; l < j; l++) {
        result.append(" ");
      }
      for (int l = 0; l < k; l++) {
        result.append("*");
      }
      result.append("\n");
    }
    return result.toString();
  }

}
