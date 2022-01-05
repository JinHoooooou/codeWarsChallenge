package codeWars.kyu8.sumMixedArray_20200603;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MixedSum {

  @Test
  public void testShouldFail() {
    // Then:
    assertEquals(10, sum(Arrays.asList(5, "5")));
  }

  public int sum(List<?> mixed) {
    return mixed.stream().map(x -> x + "").mapToInt(Integer::parseInt).sum();
  }
}
