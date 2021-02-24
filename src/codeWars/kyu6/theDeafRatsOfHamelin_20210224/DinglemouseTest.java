package codeWars.kyu6.theDeafRatsOfHamelin_20210224;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DinglemouseTest {

  @Test
  public void test1() {
    assertThat(Dinglemouse.countDeafRats("~O~O~O~O P"), is(0));
  }

  @Test
  public void test2() {
    assertThat(Dinglemouse.countDeafRats("P O~ O~ ~O O~"), is(1));
  }

  @Test
  public void test3() {
    assertThat(Dinglemouse.countDeafRats("~O~O~O~OP~O~OO~"), is(2));
  }
}