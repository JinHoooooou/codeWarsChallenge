package doNotSolve.programmers.level3.광고삽입;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String playTime = "02:03:55";
    String advTime = "00:14:15";
    String[] logs = {
        "01:20:15-01:45:14", "00:40:31-01:00:00",
        "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};
    assertThat(solution.solution(playTime, advTime, logs), is("01:30:59"));
  }

  @Test
  public void test2() {
    String playTime = "99:59:59";
    String advTime = "25:00:00";
    String[] logs = {
        "69:59:59-89:59:59", "01:00:00-21:00:00", "79:59:59-99:59:59", "11:00:00-31:00:00"};
    assertThat(solution.solution(playTime, advTime, logs), is("01:00:00"));
  }

  @Test
  public void test3() {
    String playTime = "50:00:00";
    String advTime = "50:00:00";
    String[] logs = {
        "15:36:51-38:21:49", "10:14:18-15:36:51", "38:21:49-42:51:45"};
    assertThat(solution.solution(playTime, advTime, logs), is("00:00:00"));
  }
}