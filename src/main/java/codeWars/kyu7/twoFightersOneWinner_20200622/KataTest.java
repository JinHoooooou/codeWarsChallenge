package codeWars.kyu7.twoFightersOneWinner_20200622;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KataTest {

  Kata kata = new Kata();

  @Test
  @DisplayName("test should return 'Lew'")
  public void test1() {
    // Given: Set input
    Fighter fighter1 = new Fighter("Lew", 10, 2);
    Fighter fighter2 = new Fighter("Harry", 5, 4);
    String firstAttacker = fighter1.name;

    // Then: Should return Lew
    assertEquals("Lew", kata.declareWinner(fighter1, fighter2, firstAttacker));
  }
}