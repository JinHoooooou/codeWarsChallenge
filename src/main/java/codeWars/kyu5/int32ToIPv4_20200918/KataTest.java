package codeWars.kyu5.int32ToIPv4_20200918;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertEquals("128.114.17.104", Kata.longToIP(2154959208L));
  }

  @Test
  public void test2() {
    assertEquals("0.0.0.0", Kata.longToIP(0));
  }

  @Test
  public void test3() {
    assertEquals("128.32.10.1", Kata.longToIP(2149583361L));
  }
}