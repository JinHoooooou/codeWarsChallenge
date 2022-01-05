package codeWars.directionsReduction_20200427;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DirReductionTest {

  public static final String NORTH = "NORTH";
  public static final String SOUTH = "SOUTH";
  public static final String WEST = "WEST";
  public static final String EAST = "EAST";

  @Test
  @DisplayName("test should return {} when input {}")
  public void test1() {
    // Given: Set array length 0
    String[] given = new String[]{};
    // Then: Should return empty array
    assertArrayEquals(given, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return same array when there is no opposite direction")
  public void test2() {
    // Given: Set array there is no opposite direction
    String[] given = new String[]{SOUTH, WEST, NORTH, EAST};
    // Then: Should return input array
    assertArrayEquals(given, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return {} when input array {SOUTH, NORTH}")
  public void test3() {
    // Given: Set array there is only one opposite direction
    String[] given = new String[]{SOUTH, NORTH};
    // Then: Should return empty array
    assertArrayEquals(new String[]{}, DirReduction.dirReduc(given));
  }


  @Test
  @DisplayName("test should return {EAST} when input array {NORTH, SOUTH, EAST}")
  public void test4() {
    // Given: Set array {NORTH, SOUTH, EAST}
    String[] given = new String[]{"NORTH", "SOUTH", "EAST"};
    // Then: Should return {EAST}
    assertArrayEquals(new String[]{"EAST"}, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return {} when input array {NORTH, SOUTH, EAST, WEST}")
  public void test6() {
    // Given: Set array {NORTH, SOUTH, EAST, WEST}
    String[] given = new String[]{NORTH, SOUTH, EAST, WEST};
    // Then: Should return empty array
    assertArrayEquals(new String[]{}, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return {} when input array {NORTH, EAST, WEST, SOUTH}")
  public void test7() {
    // Given: Set array {NORTH, EAST, WEST, SOUTH}
    String[] given = new String[]{NORTH, EAST, WEST, SOUTH};
    // Then: Should return empty array
    assertArrayEquals(new String[]{}, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return {} when input array {NORTH, EAST, WEST, SOUTH}")
  public void test8() {
    // Given: Set array there is consecutive opposite direction
    String[] given = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
    // Then: Should return input array
    assertArrayEquals(new String[]{"WEST"}, DirReduction.dirReduc(given));
  }

  @Test
  @DisplayName("test should return {} when input array {NORTH, EAST, WEST, SOUTH}")
  public void test9() {
    // Given: Set array there is consecutive opposite direction
    String[] given = new String[]{WEST, WEST, WEST, NORTH, SOUTH, EAST, NORTH, WEST, NORTH, WEST,
        WEST, NORTH, WEST, SOUTH, EAST};
    // Then: Should return input array
    assertArrayEquals(
        new String[]{WEST, WEST, NORTH, WEST, NORTH, WEST, WEST, NORTH, WEST, SOUTH, EAST},
        DirReduction.dirReduc(given));
  }

}