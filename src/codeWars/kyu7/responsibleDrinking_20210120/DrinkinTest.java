package codeWars.kyu7.responsibleDrinking_20210120;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DrinkinTest {

  @Test
  public void test() {
    assertThat(new Drinkin().hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer")
        , is("10 glasses of water"));
  }
}