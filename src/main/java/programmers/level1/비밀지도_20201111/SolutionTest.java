package programmers.level1.비밀지도_20201111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    String[] expected = {"#####", "# # #", "### #", "#  ##", "#####"};
    assertThat(new Solution().solution(5, arr1, arr2), is(expected));
  }
}