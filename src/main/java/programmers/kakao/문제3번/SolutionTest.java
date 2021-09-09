package programmers.kakao.문제3번;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String[] cmd = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
    assertThat(solution.solution(8, 2, cmd), is("OOOOXOOO"));
  }

  @Test
  public void test2() {
    String[] cmd = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
    assertThat(solution.solution(8, 2, cmd), is("OOXOXOOO"));
  }
}