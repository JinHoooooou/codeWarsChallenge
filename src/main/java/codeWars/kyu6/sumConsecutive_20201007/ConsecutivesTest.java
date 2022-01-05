package codeWars.kyu6.sumConsecutive_20201007;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ConsecutivesTest {

  @Test
  public void test1() {
    // Given:
    List<Integer> s = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);

    // Then:
    assertThat(Consecutives.sumConsecutives(s), is(Arrays.asList(1, 12, 0, 4, 6, 1)));
  }
}