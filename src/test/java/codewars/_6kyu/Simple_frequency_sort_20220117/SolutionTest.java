package codewars._6kyu.Simple_frequency_sort_20220117;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    int[] given = {2, 3, 5, 3, 7, 9, 5, 3, 7};
    int[] expected = {3, 3, 3, 5, 5, 7, 7, 2, 9};
    assertThat(Solution.sortByFrequency(given), is(expected));
  }
}