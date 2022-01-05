package codeWars.kyu7.maximumLengthDifference_20200618;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxDiffLengthTest {

  @Test
  @DisplayName("test should return 13")
  public void test1() {
    // Given: Set String array
    String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt",
        "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

    // Then: Should return 13
    assertEquals(13, MaxDiffLength.maxdiflg(a1, a2));
  }
}