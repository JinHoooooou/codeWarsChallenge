package codeWars.kyu7.allInclusive_20201119;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class RotationsTest {

  @Test
  public void testWhenInputStringIsEmpty() {
    String strng = "";
    List<String> arr = new ArrayList<>(Arrays.asList("bsjq", "qbsj"));
    assertTrue(Rotations.containAllRots(strng, arr));
  }

  @Test
  public void test1() {
    String strng = "bsjq";
    List<String> arr = new ArrayList<>(Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"));
    assertTrue(Rotations.containAllRots(strng, arr));
  }

  @Test
  public void test2() {
    String strng = "bsjq";
    List<String> arr = new ArrayList<>(Arrays.asList("bsjq", "sjqb", "twZNsslC", "jqbs"));
    assertFalse(Rotations.containAllRots(strng, arr));
  }
}