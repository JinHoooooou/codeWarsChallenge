package programmers.level2.메뉴리뉴얼_20210516;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
    int[] course = {2, 3, 4};
    String[] expected = {"AC", "ACDE", "BCFG", "CDE"};
    assertThat(solution.solution(orders, course), is(expected));
  }

  @Test
  public void test2() {
    String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
    int[] course = {2, 3, 5};
    String[] expected = {"ACD", "AD", "ADE", "CD", "XYZ"};
    assertThat(solution.solution(orders, course), is(expected));
  }

  @Test
  public void test3() {
    String[] orders = {"XYZ", "XWY", "WXA"};
    int[] course = {2, 3, 4};
    String[] expected = {"WX", "XY"};
    assertThat(solution.solution(orders, course), is(expected));
  }
}