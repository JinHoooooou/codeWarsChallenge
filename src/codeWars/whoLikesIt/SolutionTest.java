package codeWars.whoLikesIt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testWhenNoOneLike() {
    //Given
    String[] given = new String[0];
    //When
    String actual = Solution.whoLikesIt(given);
    //Then
    assertEquals("no one likes this", actual);
  }

  @Test
  public void testWhenOnlyOnePersonLikes() {
    //Given
    String[] given = {"Peter"};
    //When
    String actual = Solution.whoLikesIt(given);
    //Then
    assertEquals("Peter likes this", actual);
  }

  @Test
  public void testWhenTwoPeopleLike() {
    //Given
    String[] given = {"Jacob", "Alex"};
    //When
    String actual = Solution.whoLikesIt(given);
    //Then
    assertEquals("Jacob and Alex like this", actual);
  }

  @Test
  public void testWhenThreePeopleLike() {
    //Given
    String[] given = {"Max", "John", "Mark"};
    //When
    String actual = Solution.whoLikesIt(given);
    //Then
    assertEquals("Max, John and Mark like this", actual);
  }

  @Test
  public void testWhenMoreThanFourPeopleLike() {
    //Given
    String[] given = {"Alex", "Jacob", "Mark", "Max"};
    //When
    String actual = Solution.whoLikesIt(given);
    //Then
    assertEquals("Alex, Jacob and 2 others like this", actual);
  }


}