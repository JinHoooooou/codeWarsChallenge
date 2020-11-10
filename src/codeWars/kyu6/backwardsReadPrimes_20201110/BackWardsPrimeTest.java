package codeWars.kyu6.backwardsReadPrimes_20201110;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BackWardsPrimeTest {

  @Test
  public void test1() {
    assertThat(BackWardsPrime.backwardsPrime(1, 100), is("13 17 31 37 71 73 79 97"));
  }
}