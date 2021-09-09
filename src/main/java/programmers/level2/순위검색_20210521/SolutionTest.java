package programmers.level2.순위검색_20210521;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test() {
    String[] info = {"java backend junior pizza 150", "python frontend senior chicken 210",
        "python frontend senior chicken 150", "cpp backend senior pizza 260",
        "java backend junior chicken 80", "python backend senior chicken 50"};
    String[] query = {
        "java and backend and junior and pizza 100",
        "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
        "- and backend and senior and - 150", "- and - and - and chicken 100",
        "- and - and - and - 150"
    };

    assertThat(solution.solution(info, query), is(new int[]{1, 1, 1, 1, 2, 4}));
  }
}