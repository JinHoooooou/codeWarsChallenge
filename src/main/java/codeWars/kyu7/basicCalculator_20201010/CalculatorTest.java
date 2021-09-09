package codeWars.kyu7.basicCalculator_20201010;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    assertThat(Calculator.calculate(2, "+", 4), is(6.0));
  }
}