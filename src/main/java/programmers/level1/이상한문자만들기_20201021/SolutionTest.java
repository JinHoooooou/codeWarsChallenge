package programmers.level1.이상한문자만들기_20201021;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(new Solution().solution("try hello world"), is("TrY HeLlO WoRlD"));
  }

  @Test
  public void test2() {
    assertThat(new Solution().solution("try       hello           world"),
        is("TrY       HeLlO           WoRlD"));
  }
}