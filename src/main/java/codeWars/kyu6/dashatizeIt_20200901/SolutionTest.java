package codeWars.kyu6.dashatizeIt_20200901;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  @DisplayName("test when digit length 1")
  public void test1() {
    assertEquals("1", Solution.dashatize(1));
  }

  @Test
  @DisplayName("test when digit length 2")
  public void test2() {
    assertEquals("1-2", Solution.dashatize(12));
    assertEquals("24", Solution.dashatize(24));
    assertEquals("28", Solution.dashatize(-28));
  }

  @Test
  @DisplayName("test when digit length 3")
  public void test3() {
    assertEquals("1-2-3", Solution.dashatize(123));
    assertEquals("24-5", Solution.dashatize(245));
    assertEquals("1-22", Solution.dashatize(122));
    assertEquals("222", Solution.dashatize(222));
    assertEquals("1-3-5", Solution.dashatize(135));
  }

  @Test
  public void test4() {
    assertEquals("2-1-4-7-48-3-64-7", SolutionBestPractice.dashatize(2147483647));
    assertEquals("2-1-4-7-48-3-648", SolutionBestPractice.dashatize(-2147483648));
  }
}