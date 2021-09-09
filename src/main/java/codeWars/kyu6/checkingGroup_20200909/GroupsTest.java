package codeWars.kyu6.checkingGroup_20200909;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupsTest {

  @Test
  public void testWhenInputHasOneCorrectGroup() {
    assertTrue(Groups.groupCheck("()"));
  }

  @Test
  public void testWhenInputHasIncorrectGroups() {
    assertFalse(Groups.groupCheck("({)}"));
  }
}