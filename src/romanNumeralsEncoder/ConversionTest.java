package romanNumeralsEncoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConversionTest {

  Conversion conversion = new Conversion();

  @Test
  @DisplayName("test should return I, II, III when input 1,2,3")
  public void test1() {
    // Then: should return I, II, III
    assertEquals("I", conversion.solution(1));
    assertEquals("II", conversion.solution(2));
    assertEquals("III", conversion.solution(3));
  }
}