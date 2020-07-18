package codeWars.kyu6.multiTapKeypadTextEntryOnOldMobilePhone_20200718;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KeypadTest {

  @Test
  @DisplayName("test should return 9 when input=LOL")
  public void test1() {
    assertEquals(9, Keypad.presses("LOL"));
  }

  @Test
  @DisplayName("test should return 13 when input=HOW R U")
  public void test2() {
    assertEquals(13, Keypad.presses("HOW R U"));
    assertEquals(13, Keypad.presses("How r u"));
  }
}