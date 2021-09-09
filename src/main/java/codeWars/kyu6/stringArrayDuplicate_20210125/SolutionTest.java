package codeWars.kyu6.stringArrayDuplicate_20210125;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution
            .dup(new String[]{"ccooddddddewwwaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}),
        is(new String[]{"codewars", "picaniny", "hubububo"}));
  }
}