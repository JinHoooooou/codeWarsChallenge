package codeWars.kyu7.disariumNumber_20201208;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    assertThat(Solution.disariumNumber(89), is("Disarium !!"));
  }
}