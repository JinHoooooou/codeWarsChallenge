package MultiplesOf3Or5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testShouldContainMultiplesOf3(){
    //Given
    int given = 4;
    //When
    int actual = Solution.solution(given);
    //Then
    assertEquals(3, actual);
  }
  @Test
  public void testShouldContainMultiples3Or5(){
    //Given
    int given = 10;
    //When
    int actual = Solution.solution(given);
    //Then
    assertEquals(23, actual);
  }
}