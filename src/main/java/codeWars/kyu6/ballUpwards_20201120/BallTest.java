package codeWars.kyu6.ballUpwards_20201120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BallTest {

  @Test
  public void testWhenInput15() {
    assertThat(Ball.maxBall(15), is(4));
  }
}