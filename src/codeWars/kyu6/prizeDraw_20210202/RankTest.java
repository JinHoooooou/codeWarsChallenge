package codeWars.kyu6.prizeDraw_20210202;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RankTest {

  @Test
  public void testWhenNamesIsEmpty() {
    String names = "";
    Integer[] weights = new Integer[]{4, 2, 1, 4, 3, 1, 2};
    assertThat(Rank.nthRank(names, weights, 4), is("No participants"));
  }

  @Test
  public void testWhenNamesCountIsLessThanN() {
    String names = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
    Integer[] weights = new Integer[]{4, 2, 1, 4, 3, 1, 2};
    assertThat(Rank.nthRank(names, weights, 8), is("Not enough participants"));
  }

  @Test
  public void testShouldReturnBenjamin() {
    String names = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
    Integer[] weights = new Integer[]{4, 2, 1, 4, 3, 1, 2};
    assertThat(Rank.nthRank(names, weights, 4), is("Benjamin"));
  }

  @Test
  public void testShouldReturnMatthew() {
    String names = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
    Integer[] weights = new Integer[]{1, 3, 5, 5, 3, 6};
    assertThat(Rank.nthRank(names, weights, 2), is("Matthew"));
  }
}