package programmers.openChatRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public static final String ENTER = "들어왔습니다.";
  public static final String LEAVE = "나갔습니다.";

  public String[] solution(String[] records) {
    Map<String, String> idNickNameMap = getIdNickNameMap(records);
    return getResultList(records, idNickNameMap);
  }

  private String[] getResultList(String[] records, Map<String, String> idNickNameMap) {
    List<String> resultList = new ArrayList<>();
    for (String record : records) {
      if (action(record).equals("Change")) {
        continue;
      }
      resultList.add(getStringFormat(record.split(" "), idNickNameMap));
    }
    return resultList.toArray(new String[0]);
  }

  private String action(String record) {
    return record.split(" ")[0];
  }

  private String getStringFormat(String[] log, Map<String, String> idNickNameMap) {
    String result = String.format("%s님이 ", idNickNameMap.get(log[1]));
    result += log[0].equals("Enter") ? ENTER : LEAVE;
    return result;
  }

  private Map<String, String> getIdNickNameMap(String[] records) {
    Map<String, String> result = new HashMap<>();
    for (String record : records) {
      String[] log = record.split(" ");
      if (!log[0].equals("Leave")) {
        result.put(log[1], log[2]);
      }
    }
    return result;
  }
}
