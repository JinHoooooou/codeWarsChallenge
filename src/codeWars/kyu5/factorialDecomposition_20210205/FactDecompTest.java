package codeWars.kyu5.factorialDecomposition_20210205;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FactDecompTest {

  @Test
  public void test1() {
    assertThat(FactDecomp.decomp(17), is("2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17"));
  }
}