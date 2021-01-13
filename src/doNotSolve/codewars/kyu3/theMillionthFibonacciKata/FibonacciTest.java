package doNotSolve.codewars.kyu3.theMillionthFibonacciKata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;
import org.junit.Test;

public class FibonacciTest {

  @Test
  public void test1() {
    assertThat(Fibonacci.fib(BigInteger.valueOf(1000)), is(BigInteger.valueOf(10000)));
  }
}