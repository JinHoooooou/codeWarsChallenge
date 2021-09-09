package codeWars.kyu7.automorphicNumber_20201124;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class SolutionTest {

  static final String TRUE = "Automorphic";
  static final String FALSE = "NOT!!";

  @Test
  public void input_제곱_digit_같은자리가_같을경우_Automorphic() {
    assertThat(Solution.autoMorphic(1), is(TRUE));
    assertThat(Solution.autoMorphic(6), is(TRUE));
    assertThat(Solution.autoMorphic(25), is(TRUE));
    assertThat(Solution.autoMorphic(76), is(TRUE));
  }
}