package numberOfTrailingZerosOfN_20200522;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testShouldReturn0WhenInput0() {
    // Then: should return 0
    assertEquals(0, Solution.zeros(0));
  }
}