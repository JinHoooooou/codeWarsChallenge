package codeWars.kyu7.productOfMaximumOfArray_20201130;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test_WhenArrayIsContainOnlyPositive() {
    int[] array = {4, 3, 5};
    assertThat(Solution.maxProduct(array, 2), is(20L));
  }

  @Test
  public void test_WhenArrayIsContainOnlyNegative() {
    int[] array = {-4, -13, -5, -1, -15, -27};
    assertThat(Solution.maxProduct(array, 2), is(4L));
  }
}