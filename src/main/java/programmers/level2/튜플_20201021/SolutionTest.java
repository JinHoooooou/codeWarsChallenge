package programmers.level2.튜플_20201021;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"), is(new int[]{2, 1, 3, 4}));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"), is(new int[]{3, 2, 4, 1}));
  }
}