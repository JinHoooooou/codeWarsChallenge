package codeWars.sumOfPositive_20200319;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PositiveTest {

  @Test
  public void testWhenArrayIsNothingShouldReturnZero() {
    //Given : Set array length 0
    int[] given = {};
    //When : Call actual return value
    int actual = Positive.sum(given);
    //Then : should return 0
    assertEquals(0,actual);
  }

  @Test
  public void testWhenArrayIsComprisedWithOnlyPositiveInteger() {
    //Given : Set array to comprised with only positive integer
    int[] given = {1,2,3,4,5};
    //When : Call actual return value
    int actual = Positive.sum(given);
    //Then : should sum all element and return 15
    assertEquals(15,actual);
  }

  @Test
  public void testWhenArrayIsComprisedWithOnlyNegativeInteger() {
    //Given : Set array to comprised with only negative integer
    int[] given = {-1,-2,-3,-4,-5};
    //When : Call actual return value
    int actual = Positive.sum(given);
    //Then : should not sum all element and return default(0)
    assertEquals(0,actual);
  }

  @Test
  public void testWhenArrayIsComprisedWithInteger() {
    //Given : Set array to comprised with all integer
    int[] given = {1,-2,3,4,-5};
    //When : Call actual return value
    int actual = Positive.sum(given);
    //Then : Should sum only positive integer and return 8
    assertEquals(8,actual);
  }


}