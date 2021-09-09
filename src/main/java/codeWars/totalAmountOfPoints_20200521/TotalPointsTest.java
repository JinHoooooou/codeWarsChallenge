package codeWars.totalAmountOfPoints_20200521;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TotalPointsTest {

  @Test
  @DisplayName("test should return 30 when input [1:0, 2:0, 3:0, 4:0, 2:1, 3:1, 4:1, 3:2, 4:2, 4:3]")
  public void test1() {
    // Given: Set game score
    String[] given = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};

    // Then: should return 30 point
    assertEquals(30, TotalPoints.points(given));
  }
}