package codeWars.kyu3.battleshipFieldValidator_20201012;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class BattleFieldTest {

  int[][] testField = {
      {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
      {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
      {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

  @Test
  public void test1() {

    assertTrue(BattleField.fieldValidator(testField));
  }
}