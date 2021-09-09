package programmers.level1.완주하지못한선수_20201120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "mislav", "ana"};
    assertThat(new Solution().solution(participant, completion), is("mislav"));
  }
}