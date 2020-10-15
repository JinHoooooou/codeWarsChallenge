package programmers.level2.기능개발_20201015;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    assertThat(new Solution().solution(progresses, speeds), is(new int[]{2, 1}));
  }

  @Test
  public void test2() {
    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};
    assertThat(new Solution().solution(progresses, speeds), is(new int[]{1, 3, 2}));
  }
}