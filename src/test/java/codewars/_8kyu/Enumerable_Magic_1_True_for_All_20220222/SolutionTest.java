package codewars._8kyu.Enumerable_Magic_1_True_for_All_20220222;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.IntPredicate;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private static final IntPredicate EVEN_NUMBER = n -> n % 2 == 0;
  private static final IntPredicate ODD_NUMBER = n -> n % 2 == 1;
  private static final IntPredicate LESS_THAN_10 = n -> n < 10;


  @Test
  public void test1() {
    int[] list = new int[]{2, 4, 6, 10};
    assertThat(Solution.all(list, EVEN_NUMBER), is(true));
  }

  @Test
  public void test2() {
    int[] list = new int[]{1, 3, 5, 10};
    assertThat(Solution.all(list, ODD_NUMBER), is(false));
  }

  @Test
  public void test3() {
    int[] list = new int[]{2, 4, 6, 19};
    assertThat(Solution.all(list, LESS_THAN_10), is(false));
  }
}