package codeWars.kyu8.subtractTheSum_20200813;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertEquals("apple", Kata.subtractSum(10));
    assertEquals("apple", Kata.subtractSum(6894));
  }
}