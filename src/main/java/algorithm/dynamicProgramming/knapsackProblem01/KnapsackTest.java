package algorithm.dynamicProgramming.knapsackProblem01;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;


public class KnapsackTest {

  @Test
  public void test1() {
    int[][] weightAndValue = {
        {6, 13},
        {4, 8},
        {3, 6},
        {5, 12}
    };
    assertThat(new Knapsack().solution(weightAndValue, 7), is(14));
  }
}