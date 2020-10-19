package doNotSolve.codewars.kyu5.mergedStringChecker_20201017;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMergerTest {

  @Test
  public void test1() {
    assertFalse(StringMerger.isMerge("codewars", "cdw", "oear"));
  }

  @Test
  public void test2() {
    assertTrue(StringMerger.isMerge("codewars", "cdw", "oears"));
  }

  @Test
  public void test3() {
    assertFalse(StringMerger.isMerge("codewars", "cdw", "oreas"));
  }

  @Test
  public void test4() {
    assertTrue(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
  }
}