package programmers.level1.키패드누르기_20201027;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    assertThat(new Solution().solution(numbers,"right"), is("LRLLLRLLRRL"));
  }

  @Test
  public void test2() {
    int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    assertThat(new Solution().solution(numbers,"left"), is("LRLLRRLLLRR"));
  }

  @Test
  public void test3() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    assertThat(new Solution().solution(numbers,"right"), is("LLRLLRLLRL"));
  }
}