package codeWars.kyu7.sequenceSum_20200912;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequenceSumTest {

  @Test
  public void testWhenInput0() {
    assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
  }

  @Test
  public void testWhenInputPositiveInteger() {
    assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
  }

  @Test
  public void testWhenInputNegativeInteger() {
    assertArrayEquals(new int[]{0, -1, -3, -6}, SequenceSum.sumOfN(-3));
  }
}