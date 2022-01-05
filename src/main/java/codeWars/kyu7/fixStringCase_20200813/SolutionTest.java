package codeWars.kyu7.fixStringCase_20200813;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void test1() {
    assertEquals("code", Solution.solve("code"));
    assertEquals("code", Solution.solve("CoDe"));
    assertEquals("CODE", Solution.solve("CODe"));
    assertEquals("code", Solution.solve("codE"));
  }
}