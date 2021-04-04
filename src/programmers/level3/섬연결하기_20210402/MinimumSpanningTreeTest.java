package programmers.level3.섬연결하기_20210402;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumSpanningTreeTest {

  @Test
  public void test1() {
    int[][] costs = {
        {0, 1, 1},
        {0, 2, 2},
        {1, 2, 5},
        {1, 3, 1},
        {2, 3, 8}
    };
    assertThat(new Kruskal().solution(4, costs), is(4));
    assertThat(new Prim1().solution(4, costs), is(4));
    assertThat(new Prim2().solution(4, costs), is(4));
  }
}