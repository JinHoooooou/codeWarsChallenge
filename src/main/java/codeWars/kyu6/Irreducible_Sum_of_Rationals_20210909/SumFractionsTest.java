package codeWars.kyu6.Irreducible_Sum_of_Rationals_20210909;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumFractionsTest {

  @Test
  @DisplayName("test should return 13/12 when input [[1,2][1,3][1,4]]")
  public void test1() {
    // Given: input [[1,2][1,3][1,4]]가 주어진다.
    int[][] input = {
        {1, 2},
        {1, 3},
        {1, 4},
    };

    // Then: return "13/12"
    assertThat(SumFractions.sumFractions(input), is("[13, 12]"));
  }

  @Test
  @DisplayName("test should return 2 when input [[1,3][5,3]]")
  public void test2() {
    int[][] input = {
        {1, 3},
        {5, 3},
    };

    // Then: return "2"
    assertThat(SumFractions.sumFractions(input), is("2"));
  }


}