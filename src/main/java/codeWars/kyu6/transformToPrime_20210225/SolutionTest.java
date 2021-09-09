package codeWars.kyu6.transformToPrime_20210225;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.minimumNumber(new int[]{3, 1, 2}), is(1));
    assertThat(Solution.minimumNumber(new int[]{5, 2}), is(0));
    assertThat(Solution.minimumNumber(new int[]{1, 1, 1}), is(0));
  }
}