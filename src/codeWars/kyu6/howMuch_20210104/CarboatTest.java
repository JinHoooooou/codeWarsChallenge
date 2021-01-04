package codeWars.kyu6.howMuch_20210104;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CarboatTest {

  @Test
  public void test1() {
    assertThat(Carboat.howmuch(1, 100),
        is("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]"));
  }
}