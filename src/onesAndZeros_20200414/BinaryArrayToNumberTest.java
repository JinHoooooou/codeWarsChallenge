package onesAndZeros_20200414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryArrayToNumberTest {

  BinaryArrayToNumber binaryArrayToNumber = new BinaryArrayToNumber();

  @Test
  public void testShouldReturn1WhenListArray0001() {
    // Given: Set List {0,0,0,1}
    List<Integer> given = new ArrayList<>(Arrays.asList(0,0,0,1));
    // When: Call convertBinaryToInt method
    int actual = binaryArrayToNumber.convertBinaryArrayToInt(given);
    // Then: Should return 1
    assertEquals(1, actual);
  }

  @Test
  public void testShouldReturn2WhenListArray0010() {
    // Given: Set List {0,0,1,0}
    List<Integer> given = new ArrayList<>(Arrays.asList(0,0,1,0));
    // When: Call convertBinaryToInt method
    int actual = binaryArrayToNumber.convertBinaryArrayToInt(given);
    // Then: Should return 2
    assertEquals(2, actual);
  }
}