package codeWars.romanNumeralsEncoder;

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

  @Test
  @DisplayName("test should return IV when input 4")
  public void test2() {
    // Then: should return IV
    assertEquals("IV", conversion.solution(4));
  }

  @Test
  @DisplayName("test should return V,VI,VII,VIII when input 5,6,7,8")
  public void test4() {
    // Then: should return V,VI,VII,VIII
    assertEquals("V", conversion.solution(5));
    assertEquals("VI", conversion.solution(6));
    assertEquals("VII", conversion.solution(7));
    assertEquals("VIII", conversion.solution(8));
  }

  @Test
  @DisplayName("test should return XV when input 1666")
  public void test5() {
    // Then: should return MDCLXVI
    assertEquals("MDCLXVI", conversion.solution(1666));
  }
}