package codeWars.kyu5.pickPeaks_20200629;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PickPeaksTest {

  @Test
  @DisplayName("test when there is only one peak")
  public void test1() {
    // Given: Set input array
    int[] arr = {0, 1, 2, 5, 1, 0};

    // When: Call getPeaks method
    Map<String, List<Integer>> actual = PickPeaks.getPeaks(arr);

    // Then : "pos" should [3] and "peaks" should [5]
    int[] expectedPos = actual.get("pos").stream().mapToInt(x -> x).toArray();
    int[] expectedPeaks = actual.get("peaks").stream().mapToInt(x -> x).toArray();
    assertArrayEquals(expectedPos, new int[]{3});
    assertArrayEquals(expectedPeaks, new int[]{5});
  }

  @Test
  @DisplayName("test when there are two peaks")
  public void test2() {
    // Given: Set input array
    int[] arr = {1, 2, 3, 6, 4, 1, 2, 3, 2, 1};

    // When: Call getPeaks method
    Map<String, List<Integer>> actual = PickPeaks.getPeaks(arr);

    // Then : "pos" should [3,7] and "peaks" should [6,3]
    int[] expectedPos = actual.get("pos").stream().mapToInt(x -> x).toArray();
    int[] expectedPeaks = actual.get("peaks").stream().mapToInt(x -> x).toArray();
    assertArrayEquals(expectedPos, new int[]{3, 7});
    assertArrayEquals(expectedPeaks, new int[]{6, 3});
  }

  @Test
  @DisplayName("test when there are two peaks")
  public void test3() {
    // Given: Set input array
    int[] arr = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};

    // When: Call getPeaks method
    Map<String, List<Integer>> actual = PickPeaks.getPeaks(arr);

    // Then : "pos" should [3,7] and "peaks" should [6,3]
    int[] expectedPos = actual.get("pos").stream().mapToInt(x -> x).toArray();
    int[] expectedPeaks = actual.get("peaks").stream().mapToInt(x -> x).toArray();
    assertArrayEquals(expectedPos, new int[]{3, 7});
    assertArrayEquals(expectedPeaks, new int[]{6, 3});
  }

  @Test
  @DisplayName("test when there are three peaks")
  public void test4() {
    // Given: Set input array
    int[] arr = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1};

    // When: Call getPeaks method
    Map<String, List<Integer>> actual = PickPeaks.getPeaks(arr);

    // Then : "pos" should [3,7,10] and "peaks" should [6,3,2]
    int[] expectedPos = actual.get("pos").stream().mapToInt(x -> x).toArray();
    int[] expectedPeaks = actual.get("peaks").stream().mapToInt(x -> x).toArray();
    assertArrayEquals(expectedPos, new int[]{3, 7, 10});
    assertArrayEquals(expectedPeaks, new int[]{6, 3, 2});
  }

  @Test
  public void test5() {
    // Given: Set input array
    int[] arr = {2, 1, 3, 1, 2, 2, 2, 2, 1};

    // When: Call getPeaks method
    Map<String, List<Integer>> actual = PickPeaks.getPeaks(arr);

    // Then : "pos" should [2,4] and "peaks" should [3,2]
    int[] expectedPos = actual.get("pos").stream().mapToInt(x -> x).toArray();
    int[] expectedPeaks = actual.get("peaks").stream().mapToInt(x -> x).toArray();
    assertArrayEquals(expectedPos, new int[]{2, 4});
    assertArrayEquals(expectedPeaks, new int[]{3, 2});
  }
}