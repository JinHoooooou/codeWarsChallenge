package codeWars.growthOfAPopulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArgeTest {

  @Test
  public void testShouldReturn3WhenFirstPopulation1000AndPercent2AndNewInhabitant50AndWantToSee1200() {
    //Given
    int firstPopulation = 1000;
    double increasePercent = 2;
    int newInhabitant = 50;
    int expectValue = 1200;
    //When
    int actual = Arge.nbYear(firstPopulation, increasePercent, newInhabitant, expectValue);
    //Then
    assertEquals(3, actual);
  }

}