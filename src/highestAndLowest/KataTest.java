package highestAndLowest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void testWhenParameterIsOneNumber() {
    //Given
    String given = "5";
    //When
    String actual = Kata.highAndLow(given);
    //Then
    assertEquals("5 5", Kata.highAndLow(given));
  }

  @Test
  public void testWhenParameterIsTwoNumbers(){
    //Given
    String given = "5 6";
    //When
    String actual = Kata.highAndLow(given);
    //Then
    assertEquals("6 5", Kata.highAndLow(given));
  }

  @Test
  public void testWhenParameterIsMoreThanTwoNumbers(){
    //Given
    String given = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
    //When
    String actual = Kata.highAndLow(given);
    //Then
    assertEquals("42 -9", Kata.highAndLow(given));
  }
}