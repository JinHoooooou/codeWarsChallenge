package codeWars.kyu8.swapValues_20200712;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapperTest {

  @Test
  public void test1() {
    Integer[] args = new Integer[]{1, 2};
    Swapper s = new Swapper(args);
    s.swapValue();

  }
}