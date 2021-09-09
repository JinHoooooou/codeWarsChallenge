package programmers.level2.짝지어제거하기_20201117;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("baabaa"), is(1));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("cdcd"), is(0));
  }

}