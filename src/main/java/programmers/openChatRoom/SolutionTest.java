package programmers.openChatRoom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  @DisplayName("test about enter and leave")
  public void test1() {
    // Given: Set input
    String[] record = {
        "Enter uid1234 Muzi",
        "Enter uid4567 Prodo",
        "Leave uid1234"};

    // Then : Should return result record
    String[] expected = {
        "Muzi님이 들어왔습니다.",
        "Prodo님이 들어왔습니다.",
        "Muzi님이 나갔습니다."};
    assertArrayEquals(expected, solution.solution(record));
  }

  @Test
  @DisplayName("test about change")
  public void test2() {
    // Given: Set input
    String[] record = {
        "Enter uid1234 Muzi",
        "Enter uid4567 Prodo",
        "Leave uid1234",
        "Enter uid1234 Prodo",
        "Change uid4567 Ryan"
    };

    // Then : Should return result record
    String[] expected = {
        "Prodo님이 들어왔습니다.",
        "Ryan님이 들어왔습니다.",
        "Prodo님이 나갔습니다.",
        "Prodo님이 들어왔습니다."};
    assertArrayEquals(expected, solution.solution(record));
  }
}