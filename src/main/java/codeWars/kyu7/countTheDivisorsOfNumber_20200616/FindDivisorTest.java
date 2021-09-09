package codeWars.kyu7.countTheDivisorsOfNumber_20200616;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindDivisorTest {

  FindDivisor findDivisor = new FindDivisor();

  @Test
  @DisplayName("test should return 3 when input 4")
  public void test1() {
    // Then: Should return 3
    assertEquals(3, findDivisor.numberOfDivisors(4));
  }
}