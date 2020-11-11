package codeWars.kyu7.balancedNumber_20201111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.balancedNum(7), is("Balanced"));
    assertThat(Solution.balancedNum(959), is("Balanced"));
    assertThat(Solution.balancedNum(13), is("Balanced"));
    assertThat(Solution.balancedNum(1301), is("Balanced"));
  }

  @Test
  public void test2() {
    assertThat(Solution.balancedNum(1024), is("Not Balanced"));
    assertThat(Solution.balancedNum(66545), is("Not Balanced"));
    assertThat(Solution.balancedNum(295591), is("Not Balanced"));
    assertThat(Solution.balancedNum(1230987), is("Not Balanced"));
    assertThat(Solution.balancedNum(56239814), is("Balanced"));
  }
}