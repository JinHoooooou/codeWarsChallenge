package programmers.방금그곡;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() throws ParseException {
    // Given: Set input
    String m = "ABCDEFG";
    String[] musicInfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};

    // When: Call method
    String actual = solution.solution(m, musicInfos);

    // Then: Should return "HELLO"
    assertEquals("HELLO", actual);
  }

  @Test
  public void test2() throws ParseException {
    // Given: Set input
    String m = "CC#BCC#BCC#BCC#B";
    String[] musicInfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};

    // When: Call method
    String actual = solution.solution(m, musicInfos);

    // Then: Should return "FOO"
    assertEquals("FOO", actual);
  }

  @Test
  public void test3() throws ParseException {
    // Given: Set input
    String m = "ABC";
    String[] musicInfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};

    // When: Call method
    String actual = solution.solution(m, musicInfos);

    // Then: Should return "WORLD"
    assertEquals("WORLD", actual);
  }
}