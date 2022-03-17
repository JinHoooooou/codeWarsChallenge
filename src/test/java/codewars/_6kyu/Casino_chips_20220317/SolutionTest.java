package codewars._6kyu.Casino_chips_20220317;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    int[] input = {4, 7, 10};
    int expected = 10;
    assertThat(Solution.solve(input), is(10));
  }
}