package programmers.level2.뉴스클러스터링_20201210;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("FRANCE", "french"), is(16384));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("handshake", "shake hands"), is(65536));
  }

  @Test
  public void test3() {
    assertThat(new Solution().solution("aa1+aa2", "AAAA12"), is(43690));
  }

  @Test
  public void test4() {
    assertThat(new Solution().solution("E=M*C^2", "e=m*c^2"), is(65536));
  }
}