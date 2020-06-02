package codeWars.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
  @Test
  public void testParameterIsEmptyShouldReturnZero(){
    //Given
    String given = "";
    //when
    int actual = StringCalculator.add(given);
    //then
    assertEquals(0, actual);
  }

  @Test
  public void testParameterIsNullShouldReturnZero(){
    //Given
    String given = null;
    //When
    int actual = StringCalculator.add(given);
    //Then
    assertEquals(0,actual);
  }

  @Test
  public void testParameterIsOneNumberShouldReturnThatNumber(){
    //Given
    String given = "123";
    //When
    int actual = StringCalculator.add(given);
    //Then
    assertEquals(123,actual);
  }

  @Test
  public void testParameterHasCommaShouldReturnAddTwoNumber() {
    //Given
    String given = "3,8";
    //When
    int actual = StringCalculator.add(given);
    //Then
    assertEquals(11,actual);
  }
}