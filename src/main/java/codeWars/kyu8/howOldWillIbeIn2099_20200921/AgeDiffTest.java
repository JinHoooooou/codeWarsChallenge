package codeWars.kyu8.howOldWillIbeIn2099_20200921;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeDiffTest {

  @Test
  public void testWhenBirthIsLessThanYearTo() {
    // Given: Set birth, yearTo
    int birth = 2012;
    int yearTo = 2016;

    assertEquals("You are 4 years old.", AgeDiff.calculateAge(birth, yearTo));
  }
}