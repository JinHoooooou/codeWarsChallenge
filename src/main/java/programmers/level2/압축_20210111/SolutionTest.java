package programmers.level2.압축_20210111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("KAKAO"), is(new int[]{11, 1, 27, 15}));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("TOBEORNOTTOBEORTOBEORNOT"),
        is(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34}));
  }

  @Test
  public void test3() {
    assertThat(new Solution().solution("ABABABABABABABAB"),
        is(new int[]{1, 2, 27, 29, 28, 31, 30}));
  }
}