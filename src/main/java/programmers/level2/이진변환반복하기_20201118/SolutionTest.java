package programmers.level2.이진변환반복하기_20201118;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("110010101001"), is(new int[]{3, 8}));
  }
}