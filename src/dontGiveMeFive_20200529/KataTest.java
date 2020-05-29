package dontGiveMeFive_20200529;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  @DisplayName("test should return 34 when input 23 to 70")
  public void test1() {
    assertEquals(34, Kata.dontGiveMeFive(23, 70));
  }
}