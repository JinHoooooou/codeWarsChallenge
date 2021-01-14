package codeWars.kyu4.magnetParticulesInBoxes_20210114;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MagnetsTest {

  @Test
  public void test1() {
    assertThat(Magnets.doubles(1, 3), is(0.4236111111111111));
  }

  @Test
  public void test2() {
    assertThat(Magnets.doubles(1, 10), is(0.5580321939764581));
  }

  @Test
  public void test3() {
    assertThat(Magnets.doubles(10, 1000), is(0.6921486500921933));
  }
}