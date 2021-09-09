package codeWars.kyu7.arrayLeader_20210222;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    int[] numbers = {1, 2, 3, 4, 0};
    List<Integer> expected = Arrays.asList(4);
    assertThat(Solution.arrayLeaders(numbers), is(expected));
  }
}