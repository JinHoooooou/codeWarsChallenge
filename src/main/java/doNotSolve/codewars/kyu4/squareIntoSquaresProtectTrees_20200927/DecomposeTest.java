package doNotSolve.codewars.kyu4.squareIntoSquaresProtectTrees_20200927;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecomposeTest {

  @Test
  public void testWhenInputIs1() {
    assertEquals(null, new Decompose().decompose(1));
  }

  @Test
  public void testWhenInputIs11() {
    assertEquals("1 2 4 10", new Decompose().decompose(11));
  }

  @Test
  public void testWhenInputIs12() {
    assertEquals("1 2 3 7 9", new Decompose().decompose(12));
  }
}