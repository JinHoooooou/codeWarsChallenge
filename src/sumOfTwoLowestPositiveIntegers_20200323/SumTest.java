package sumOfTwoLowestPositiveIntegers_20200323;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

  @Test
  public void testShouldReturn1WhenGivenArray() {
    //Given : Set array {0,1,2,3}
    int[] given = {15, 28, 4, 2, 43};
    //When : Call sumTwoSmallestNumbers
    int actual = Sum.sumTwoSmallestNumbers(given);
    //Then
    assertEquals(6,actual);
  }

}