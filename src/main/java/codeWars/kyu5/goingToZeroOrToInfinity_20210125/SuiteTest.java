package codeWars.kyu5.goingToZeroOrToInfinity_20210125;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest {

  @Test
  public void test1() {
    assertEquals(1.275, Suite.going(5), 1e-10);
    assertEquals(1.2125, Suite.going(6), 1e-10);
    assertEquals(1.173214, Suite.going(7), 1e-10);
  }
}