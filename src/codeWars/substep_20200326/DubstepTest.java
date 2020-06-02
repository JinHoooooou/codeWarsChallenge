package codeWars.substep_20200326;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//word마다 사이에 WUB가 붙을 수 있다.
//문자열 시작점이나 끝점에 WUB가 붙을수있다.(근데 없을수도있다.)

class DubstepTest {

  @Test
  public void testShouldReturnABCWhenStringIsWUBWUBABCWUB() {
    //Given : WUBWUBABCWUB
    String given = "WUBWUBABCWUB";
    //When : Call SongDecoder
    String actual = Dubstep.songDecoder(given);
    //Then : Should return "ABC"
    assertEquals("ABC", actual);
  }

  @Test
  public void testShouldRAndLWhenStringIsRWUBWUBWUBLWUB() {
    //Given : RWUBWUBWUBLWUB
    String given = "RWUBWUBWUBLWUB";
    //When : Call SongDecoder
    String actual = Dubstep.songDecoder(given);
    //Then : Should return "ABC"
    assertEquals("R L", actual);
  }
}