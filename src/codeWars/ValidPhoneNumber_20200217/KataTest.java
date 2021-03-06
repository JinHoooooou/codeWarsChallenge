package codeWars.ValidPhoneNumber_20200217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

  @Test
  public void shouldReturnFalseWithEmptyString() {
    assertEquals(false, Kata.validPhoneNumber(""));
  }

  @Test
  public void should_return_false_with_not_using_hypen() {
    assertEquals(false, Kata.validPhoneNumber("(123) 456-7890"));
  }


}