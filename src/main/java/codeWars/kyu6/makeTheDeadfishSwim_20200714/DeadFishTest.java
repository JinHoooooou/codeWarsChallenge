package codeWars.kyu6.makeTheDeadfishSwim_20200714;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeadFishTest {

  @Test
  @DisplayName("test shoudl return [8,64] when input=iiisdoso")
  public void test1() {
    assertArrayEquals(new int[]{8, 64}, DeadFish.parse("iiisdoso"));
  }
}