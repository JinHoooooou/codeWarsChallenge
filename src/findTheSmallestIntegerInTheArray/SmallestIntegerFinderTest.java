package findTheSmallestIntegerInTheArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

  @Test
  public void testShouldReturnSmallestInteger() {
    //Given : Set integer arrays
    int[] given = {34, 15, 88, 2};
    //When : Call findSmallestInteger method
    int actual = SmallestIntegerFinder.findSmallestInt(given);
    //Then : Should return 2
    assertEquals(2,actual);
  }

}