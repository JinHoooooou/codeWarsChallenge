package codeWars.kyu4.catchingCarMileageNumbers_20200916;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarMileageTest {

  @Test
  public void testFarNotInteresting() {
    assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
  }

  @Test
  public void testDecrementing() {
    assertEquals(2, CarMileage.isInteresting(3210, new int[]{}));
  }

  @Test
  public void testMonotone() {
    assertEquals(1, CarMileage.isInteresting(109, new int[]{}));
  }
}