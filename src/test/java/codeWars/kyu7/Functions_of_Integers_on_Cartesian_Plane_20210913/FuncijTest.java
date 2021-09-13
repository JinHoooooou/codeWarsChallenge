package codeWars.kyu7.Functions_of_Integers_on_Cartesian_Plane_20210913;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.math.BigInteger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FuncijTest {

  @Test
  @DisplayName("test should return 91 when input 6")
  public void test_sumin1() {
    assertThat(Funcij.sumin(6), is(BigInteger.valueOf(91)));
  }

  @Test
  @DisplayName("test should return 161 when input 6")
  public void test_sumax1() {
    assertThat(Funcij.sumax(6), is(BigInteger.valueOf(161)));
  }
  @Test
  @DisplayName("test should return 252 when input 6")
  public void test_sumsum1() {
    assertThat(Funcij.sumsum(6), is(BigInteger.valueOf(252)));
  }

}