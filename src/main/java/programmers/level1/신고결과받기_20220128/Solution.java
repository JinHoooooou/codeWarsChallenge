package programmers.level1.신고결과받기_20220128;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int[] solution(String[] id_list, String[] report, int k) {
    String[] distinctReport = Arrays.stream(report).distinct().toArray(String[]::new);
    Map<String, Integer> reportCountMap = calculateReportCount(id_list, distinctReport);
    Map<String, Integer> messageCountMap = calculateMessageCount(id_list, k, distinctReport,
        reportCountMap);
    int[] result = new int[id_list.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = messageCountMap.get(id_list[i]);
    }
    return result;
  }

  private Map<String, Integer> calculateMessageCount(String[] id_list, int k,
      String[] distinctReport, Map<String, Integer> reportCountMap) {
    Map<String, Integer> messageCountMap = new HashMap<>();
    for (String id : id_list) {
      messageCountMap.put(id, 0);
    }

    for (String reportContent : distinctReport) {
      String reporter = reportContent.split(" ")[0];
      String reported = reportContent.split(" ")[1];
      if (reportCountMap.get(reported) >= k) {
        messageCountMap.replace(reporter, messageCountMap.get(reporter) + 1);
      }
    }
    return messageCountMap;
  }

  private Map<String, Integer> calculateReportCount(String[] id_list, String[] report) {
    Map<String, Integer> result = new HashMap<>();
    for (String id : id_list) {
      result.put(id, 0);
    }
    for (String reportContent : report) {
      String reported = reportContent.split(" ")[1];
      result.replace(reported, result.get(reported) + 1);
    }
    return result;
  }
}
