package programmers.두개_뽑아_더하기;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7},
        new Solution().solution(new int[]{2, 1, 3, 4, 1}));
  }
}