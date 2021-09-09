package programmers.level1.완주하지못한선수_20201120;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public String solution(String[] participant, String[] completion) {
    Map<String, Integer> participants = new HashMap<>();
    for (int i = 0; i < participant.length; i++) {
      participants.put(participant[i], participants.getOrDefault(participant[i], 0) + 1);
    }

    for (int i = 0; i < completion.length; i++) {
      participants.put(completion[i], participants.get(completion[i]) - 1);
    }

    String result = "";
    for (Entry<String, Integer> entry : participants.entrySet()) {
      if (entry.getValue() != 0) {
        result = entry.getKey();
      }
    }
    return result;
  }
}
