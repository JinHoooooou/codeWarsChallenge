package codeWars.tortoiseRacing_20200530;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TortoiseTest {

  @Test
  @DisplayName("test should null when v1>=v2")
  public void test1() {
    // Then: Should return null
    assertNull(Tortoise.race(100,80,40));
  }


  @Test
  @DisplayName("test should [2,0,0] when v1=80, v2=100 g=40")
  public void test2() {
    // Then: Should return [2,0,0]
    assertArrayEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
  }

  @Test
  @DisplayName("test should [0,32,18] when v1=720, v2=850 g=70")
  public void test3() {
    // Then: Should return [0,32,18]
    assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
  }
}