package codeWars.bouncingBalls_20200505;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BouncingBallTest {

  @Test
  public void testShouldReturnNegative1WhenConditionNotMet() {
    // Given: Set condition not fulfilled
    double h = 0;
    double bounce = 2;
    double window = 5;
    // When: Call bouncingBall method
    int actual = BouncingBall.bouncingBall(h, bounce, window);
    // Then: Should return -1
    assertEquals(-1, actual);
  }

  @Test
  @DisplayName("test should return 3 when h=3.0, bounce=0.66, window=1.5")
  public void test1() {
    // Given: Set condition
    double h = 3.0;
    double bounce = 0.66;
    double window = 1.5;
    // When: Call bouncingBall method
    int actual = BouncingBall.bouncingBall(h, bounce, window);
    // Then: Should return 3
    assertEquals(3, actual);
  }

  @Test
  @DisplayName("test should return 15 when h=30.0, bounce=0.66, window=1.5")
  public void test2() {
    // Given: Set condition
    double h = 30.0;
    double bounce = 0.66;
    double window = 1.5;
    // When: Call bouncingBall method
    int actual = BouncingBall.bouncingBall(h, bounce, window);
    // Then: Should return 15
    assertEquals(15, actual);
  }
}