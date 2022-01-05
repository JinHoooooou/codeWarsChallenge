package codeWars.stringRepeat_20200325;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testShouldReturnIIIIIIWhenInputStringIsIAndRepeat6() {
    //Given : Set string I and repeat 6
    int givenRepeat = 6;
    String givenString = "I";
    //When : Call repeatStr
    String actual = Solution.repeatStr(givenRepeat, givenString);
    //Then
    assertEquals("IIIIII", actual);
  }

  @Test
  public void testShould5TimesHelloWhenInputStringIsHelloAndRepeat5() {
    //Given : Set string Hello and repeat 5
    int givenRepeat = 5;
    String givenString = "Hello";
    //When : Call repeatStr
    String actual = Solution.repeatStr(givenRepeat, givenString);
    //Then
    assertEquals("HelloHelloHelloHelloHello", actual);
  }

}