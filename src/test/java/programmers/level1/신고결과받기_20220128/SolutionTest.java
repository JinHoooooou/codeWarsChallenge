package programmers.level1.신고결과받기_20220128;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;
    Solution solution = new Solution();

    int[] expected = {2, 1, 1, 0};
    assertThat(solution.solution(id_list, report, k), is(expected));
  }

  @Test
  public void test2() {
    String[] id_list = {"con", "ryan"};
    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
    int k = 3;
    Solution solution = new Solution();

    int[] expected = {0, 0};
    assertThat(solution.solution(id_list, report, k), is(expected));
  }
}