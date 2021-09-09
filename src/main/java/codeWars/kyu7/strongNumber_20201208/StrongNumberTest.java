package codeWars.kyu7.strongNumber_20201208;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StrongNumberTest {

  @Test
  public void test1() {
    assertThat(StrongNumber.isStrongNumber(2), is("STRONG!!!!"));
  }
}