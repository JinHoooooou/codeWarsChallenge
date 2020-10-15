package programmers.level1.문자열내림차순으로배치하기_20201015;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("Zbcdefg"), is("gfedcbZ"));
  }
}