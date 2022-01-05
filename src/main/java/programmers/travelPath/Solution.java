package programmers.travelPath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {

  List<String> pathList = new ArrayList<>();
  boolean[] visited;

  public String[] solution(String[][] tickets) {
    visited = new boolean[tickets.length];

    dfs(tickets, "ICN", 1);
    pathList.sort(Comparator.naturalOrder());

    return getResultArray(pathList.get(0));
  }

  private String[] getResultArray(String s) {
    List<String> list = new ArrayList<>();
    while (s.length() != 0) {
      list.add(s.substring(0, 3));
      s = s.substring(3);
    }
    return list.toArray(new String[0]);
  }

  private void dfs(String[][] tickets, String path, int pathCount) {
    if (pathCount == tickets.length + 1) {
      pathList.add(path);
      return;
    }
    String destination = extractDestination(path, pathCount);
    for (int i = 0; i < tickets.length; i++) {
      if (destination.equals(tickets[i][0]) && !visited[i]) {
        visited[i] = true;
        dfs(tickets, path + tickets[i][1], pathCount + 1);
        visited[i] = false;
      }
    }
  }

  private String extractDestination(String path, int pathCount) {
    return path.substring((pathCount - 1) * 3, ((pathCount - 1) * 3) + 3);
  }

}