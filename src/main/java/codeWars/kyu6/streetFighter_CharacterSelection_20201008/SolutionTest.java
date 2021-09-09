package codeWars.kyu6.streetFighter_CharacterSelection_20201008;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  String[][] fighters = new String[][]{
      new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
      new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
  };

  @Test
  public void testWhenNoMove() {
    assertThat(Solution.streetFighterSelection(fighters, new int[]{0, 0}, new String[]{}),
        is(new String[]{}));
  }

  @Test
  public void testWhenBasicMove() {
    String[] moves = {"up", "left", "right", "left", "left"};
    String[] expected = {"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
    assertThat(Solution.streetFighterSelection(fighters, new int[]{0, 0}, moves),
        is(expected));
  }
}