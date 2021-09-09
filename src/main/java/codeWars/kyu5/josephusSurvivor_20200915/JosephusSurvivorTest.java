package codeWars.kyu5.josephusSurvivor_20200915;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JosephusSurvivorTest {

  @Test
  public void test1() {
    assertEquals(4, JosephusSurvivor.josephusSurvivor(7, 3));
  }

  @Test
  public void test2() {
    assertEquals(10, JosephusSurvivor.josephusSurvivor(11, 19));
  }
}