package codeWars.kyu5.doubleCola_20200701;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

  String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

  @Test
  @DisplayName("test should return 'Sheldon' when n=1")
  public void test1() {
    // Then: Should return Sheldon
    assertEquals("Sheldon", Line.WhoIsNext(names, 1));
  }

  @Test
  @DisplayName("test should return 'Penny' when n=52")
  public void test2() {
    // Then: Should return Penny
    assertEquals("Penny", Line.WhoIsNext(names, 52));
  }
}