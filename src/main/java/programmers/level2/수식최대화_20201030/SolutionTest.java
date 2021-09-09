package programmers.level2.수식최대화_20201030;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenOnlyOneOperation() {
    assertThat(new Solution().solution("50*6*3*2"), is(1800L));
  }

  @Test
  public void testWhenTwoOperations() {
    assertThat(new Solution().solution("50*6-3*2"), is(300L));
  }

  @Test
  public void testWhenThreeOperations() {
    assertThat(new Solution().solution("100-200*300-500+20"), is(60420L));
  }
}