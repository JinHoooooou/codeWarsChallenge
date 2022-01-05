package codeWars.kyu6.rectangleIntoSquare_20200607;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SqInRectTest {

  @Test
  @DisplayName("test should return [1,1] when input 2, 1")
  public void test1() {

    // When: Call sqInRect method
    List<Integer> actual = SqInRect.sqInRect(2, 1);

    // Then: Should return [1,1]
    assertArrayEquals(new int[]{1, 1}, actual.stream().mapToInt(x -> x).toArray());
  }
}