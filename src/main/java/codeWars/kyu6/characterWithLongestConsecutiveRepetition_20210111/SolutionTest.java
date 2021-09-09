package codeWars.kyu6.characterWithLongestConsecutiveRepetition_20210111;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testWhenInputIsEmpty() {
    assertThat(Solution.longestRepetition(""), is(new Object[]{"", 0}));
  }

  @Test
  public void test1() {
    assertThat(Solution.longestRepetition("aaaabb"), is(new Object[]{"a", 4}));
  }

  @Test
  public void test2() {
    assertThat(Solution.longestRepetition("bbbaaabaaaa"), is(new Object[]{"a", 4}));
  }

  @Test
  public void test3() {
    assertThat(Solution.longestRepetition("cbdeuuu900"), is(new Object[]{"u", 3}));
    assertThat(Solution.longestRepetition("abbbbb"), is(new Object[]{"b", 5}));
    assertThat(Solution.longestRepetition("aabb"), is(new Object[]{"a", 2}));

  }
}