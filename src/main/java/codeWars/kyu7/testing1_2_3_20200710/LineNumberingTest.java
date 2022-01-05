package codeWars.kyu7.testing1_2_3_20200710;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineNumberingTest {

  @Test
  @DisplayName("test should add index")
  public void test1() {
    assertEquals(
        Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
  }
}