package programmers.level3.단어변환_20220125;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    Solution solution = new Solution();
    String begin = "hit";
    String target = "cog";
    String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
    int actual = solution.solution(begin, target, words);

    assertThat(actual, is(4));
  }

  @Test
  public void test2() {
    Solution solution = new Solution();
    String begin = "hit";
    String target = "cog";
    String[] words = {"hot", "dot", "dog", "lot", "log"};
    int actual = solution.solution(begin, target, words);

    assertThat(actual, is(0));
  }
}