package programmers.level1.시저암호_20201020;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInputIsOnlyAlphabet() {
    assertThat(new Solution().solution("AB", 1), is("BC"));
  }

  @Test
  public void testWhenInputContainSpace() {
    assertThat(new Solution().solution("A B", 1), is("B C"));
  }

  @Test
  public void testShouldCycleZtoA() {
    assertThat(new Solution().solution("Z Y", 3), is("C B"));
    assertThat(new Solution().solution("Zz Yy", 3), is("Cc Bb"));
  }

}