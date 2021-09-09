package codeWars.takeATenMinuteWalk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TenMinWalkTest {

  //'w''s''n''e' char가 주어지는데
  //이게 10개를 이루는데, 결국 제자리로 와야한다.
  //10개 아니면 false
  //제자리로 오지않으면 false

  @Test
  public void testShouldReturnFalseWhenInputLengthIsNotTen() {
    //Given : Set walking count less then 10
    char[] given = new char[5];
    //When : Call isValid method
    boolean actual = TenMinWalk.isValid(given);
    //Then : Should return false
    assertEquals(false, actual);
  }

  @Test
  public void testShouldReturnFalseWhenWalkerNotComeStartingPoint() {
    //Given : Set walking count 10, not coming to starting point
    char[] given = {'w', 's', 'e', 'n', 'w',
        'w', 'e', 'n', 'w', 'w'};
    //When : Call isValid method
    boolean actual = TenMinWalk.isValid(given);
    //Then : Should return false
    assertEquals(false, actual);
  }

  @Test
  public void testShouldReturnTrueWhenWalkerComeStartingPoint() {
    //Given : Set walking count 10, coming to starting point
    char[] given = {'w', 's', 'e', 'n', 'w',
        's', 'e', 'n', 'w','e'};
    //When : Call isValid method
    boolean actual = TenMinWalk.isValid(given);
    //Then : Should return true
    assertEquals(true, actual);
  }
}