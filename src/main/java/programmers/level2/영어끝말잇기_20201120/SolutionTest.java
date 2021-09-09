package programmers.level2.영어끝말잇기_20201120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenWordChainComplete() {
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot"};
    assertThat(new Solution().solution(3, words), is(new int[]{0, 0}));
  }

  @Test
  public void testWhenUseDuplicatedWord() {
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    assertThat(new Solution().solution(3, words), is(new int[]{3, 3}));
  }

  @Test
  public void testWhenNotEqualLastCharacterWithFirstCharacter() {
    String[] words = {"hello", "one", "even", "never", "now", "world", "draw", };
    assertThat(new Solution().solution(3, words), is(new int[]{2, 2}));
  }
}