package codewars._5kyu.Decimal_to_Factorial_and_Back_20220321;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dec2FactTest {

  @Test
  public void testDecimalToFactorial1() {
    long nb = 1001L;
    String expected = "1212210";

    assertThat(Dec2Fact.dec2FactString(nb), is(expected));
  }

  @Test
  public void testDecimalToFactorial2() {
    long nb = 1234567890L;
    String expected = "26A2116333000";

    assertThat(Dec2Fact.dec2FactString(nb), is(expected));
  }

  @Test
  public void testDecimalToFactorial3() {
    long nb = 9876543210L;
    String expected = "17747074033000";

    assertThat(Dec2Fact.dec2FactString(nb), is(expected));
  }

  @Test
  public void testFactorialToDecimal1() {
    String str = "1212210";
    long expected = 1001L;

    assertThat(Dec2Fact.factString2Dec(str), is(expected));
  }

  @Test
  public void testFactorialToDecimal2() {
    String str = "A";
    long expected = 10L;

    assertThat(Dec2Fact.factString2Dec(str), is(expected));
  }
}