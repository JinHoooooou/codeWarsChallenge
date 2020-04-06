package findThePartyOutlier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindOutlierTest {

  @Test
  public void testWhenArrayHasOnlyOneEvenInteger() {
    //Given
    int[] given = {1, 3, 5, 6, 7, 9, 11, 13};
    //When
    int actual = FindOutlier.find(given);
    //Then
    assertEquals(6, actual);
  }

  @Test
  public void testWhenArrayHasOnlyOneoddInteger() {
    //Given
    int[] given = {2, 10, 4, 6, 8, 7, 12, 16};
    //When
    int actual = FindOutlier.find(given);
    //Then
    assertEquals(7, actual);
  }
}