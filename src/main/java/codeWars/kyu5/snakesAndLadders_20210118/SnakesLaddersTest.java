package codeWars.kyu5.snakesAndLadders_20210118;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakesLaddersTest {

  @Test
  public void test1() {
    SnakesLadders games = new SnakesLadders();
    assertThat(games.play(1, 1), is("Player 1 is on square 38"));
    assertThat(games.play(1, 5), is("Player 1 is on square 44"));
    assertThat(games.play(6, 2), is("Player 2 is on square 31"));
    assertThat(games.play(1, 1), is("Player 1 is on square 25"));
  }
}