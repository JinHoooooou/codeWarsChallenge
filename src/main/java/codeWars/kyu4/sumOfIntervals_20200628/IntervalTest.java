package codeWars.kyu4.sumOfIntervals_20200628;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntervalTest {

  @Test
  @DisplayName("test should handle null or empty intervals")
  public void test1() {
    assertEquals(0, Interval.sumIntervals(null));
    assertEquals(0, Interval.sumIntervals(new int[][]{}));
    assertEquals(0, Interval.sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
  }

  @Test
  @DisplayName("test should add disjoined intervals")
  public void test2() {
    assertEquals(9, Interval.sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
    assertEquals(11, Interval.sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
    assertEquals(7, Interval.sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
    assertEquals(78, Interval.sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
  }

  @Test
  @DisplayName("test should add adjacent intervals")
  public void test3() {
    assertEquals(54, Interval.sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
    assertEquals(23, Interval.sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
  }

  @Test
  @DisplayName("test should add overlapping intervals")
  public void test4() {
    assertEquals(7, Interval.sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
    assertEquals(6, Interval.sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
    assertEquals(19,
        Interval.sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
  }

  @Test
  @DisplayName("test should handle mixed intervals")
  public void test5() {
    assertEquals(13, Interval.sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
    assertEquals(1234, Interval
        .sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
    assertEquals(158,
        Interval.sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},}));
  }
}