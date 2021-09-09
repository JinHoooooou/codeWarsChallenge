package codeWars.kyu7.rotateForMax_20201013;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MaxRotateTest {

  @Test
  public void test1() {
    assertThat(MaxRotate.maxRot(56789), is(68957L));
  }
}