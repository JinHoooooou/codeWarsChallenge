package codeWars.kyu7.goingToTheCinema_20201015;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

  @Test
  public void test1() {
    assertThat(Movie.movie(500, 15, 0.9), is(43));
  }

  @Test
  public void test2() {
    assertThat(Movie.movie(0, 10, 0.95), is(2));
  }
}