package equalSidesOfAnArray_20200411;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testShouldReturnMinus1WhenThereIsNoIndex() {
    // Given: Set int array no index of left number that equal sums of right numbers
    int[] given = {1, 2, 3, 4, 5, 6};

    // When: Call findEvenIndex method
    int actual = Kata.findEvenIndex(given);

    // Then: Should return -1
    assertEquals(-1, actual);
  }

  @Test
  public void testShouldReturn3When왼쪽index3번까지합이오른쪽index합에있을때() {
    // Given: Set int array no index of left number that equal sums of right numbers
    int[] given = {1, 2, 3, 4, 3, 2, 1};

    // When: Call findEvenIndex method
    int actual = Kata.findEvenIndex(given);

    // Then: Should return -1
    assertEquals(3, actual);
  }

  @Test
  public void testShouldReturn1() {
    // Given: Set int array no index of left number that equal sums of right numbers
    int[] given = {1,100,50,-51,1,1};

    // When: Call findEvenIndex method
    int actual = Kata.findEvenIndex(given);

    // Then: Should return -1
    assertEquals(1, actual);
  }

  @Test
  public void testShouldReturn0() {
    // Given: Set int array no index of left number that equal sums of right numbers
    int[] given = {20,10,-80,10,10,15,35};

    // When: Call findEvenIndex method
    int actual = Kata.findEvenIndex(given);

    // Then: Should return -1
    assertEquals(0, actual);
  }


}