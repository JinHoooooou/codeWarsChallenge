package programmers.level2.쿼드압축후개수세기;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInputSize1x1() {
    int[][] arr = {{1}};
    assertThat(new Solution().solution(arr), is(new int[]{0, 1}));

    arr = new int[][]{{0}};
    assertThat(new Solution().solution(arr), is(new int[]{1, 0}));
  }

  @Test
  public void testWhenInputSize2x2() {
    int[][] arr = {
        {1, 1},
        {1, 1}};
    assertThat(new Solution().solution(arr), is(new int[]{0, 1}));

    arr = new int[][]{
        {0, 0},
        {0, 0}};
    assertThat(new Solution().solution(arr), is(new int[]{1, 0}));

    arr = new int[][]{
        {1, 0},
        {1, 0}
    };
    assertThat(new Solution().solution(arr), is(new int[]{2, 2}));
  }

  @Test
  public void testWhenInputSize4x4() {
    int[][] arr = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    };
    assertThat(new Solution().solution(arr), is(new int[]{0, 1}));

    arr = new int[][]{
        {0, 0, 1, 1},
        {0, 0, 1, 1},
        {0, 1, 0, 1},
        {1, 1, 0, 0}};
    assertThat(new Solution().solution(arr), is(new int[]{5, 5}));

    arr = new int[][]{
        {1, 0, 0, 1},
        {1, 0, 1, 1},
        {1, 1, 1, 0},
        {0, 1, 0, 1}
    };
    assertThat(new Solution().solution(arr), is(new int[]{6, 10}));
  }

  @Test
  public void testWhenInputSize8x8() {
    int[][] arr = {
        {1, 1, 1, 1, 1, 1, 1, 1},
        {0, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1, 1, 1, 1},
        {0, 1, 0, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1, 0, 0, 1},
        {0, 0, 0, 0, 1, 1, 1, 1}
    };
    assertThat(new Solution().solution(arr), is(new int[]{10, 15}));

  }
}