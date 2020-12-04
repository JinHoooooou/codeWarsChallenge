package codeWars.kyu6.newCashierDoseNotKnowAboutSpaceOrShift_20201204;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1() {
    String input = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
    String expected = "Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke";
    assertThat(Solution.getOrder(input), is(expected));
  }

}