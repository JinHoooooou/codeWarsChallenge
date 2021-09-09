package programmers.candidateKey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

  List<String> visit = new ArrayList<>();
  Map<String, List<String>> columnMap = new HashMap<>();

  public int solution(String[][] relation) {

    int result = 0;
    for (int i = 0; i < relation[0].length; i++) {
      dfs(String.valueOf((char) ('a' + i)), 0, relation[0].length, relation);
    }
    visit.sort(Comparator.comparing(String::length));

    while (!visit.isEmpty()) {
      int size = visit.size();
      for (String columns : visit) {
        String[] split = columns.split("");
        String[] array = new String[relation.length];
        Arrays.fill(array, "");
        for (String column : split) {
          List<String> tuples = columnMap.get(column);
          for (int i = 0; i < tuples.size(); i++) {
            array[i] += tuples.get(i);
          }
        }
        Set<String> set = new HashSet<>(Arrays.asList(array));
        if (set.size() == relation.length) {
          result++;
          List<String> temp = new ArrayList<>();
          for (int i = 0; i < visit.size(); i++) {
            if (!visit.get(i).contains(columns)) {
              temp.add(visit.get(i));
            }
          }
          visit = temp;
          break;
        } else {
          visit.remove(columns);
          break;
        }

      }
    }
    return result;
  }

  private void dfs(String column, int index, int length, String[][] relation) {
    if (column.length() > length) {
      return;
    }
    if (column.charAt(column.length() - 1) > (char) ('a' + length - 1)) {
      return;
    }
    if (column.length() == 1) {
      int pos = column.charAt(0) - 'a';
      List<String> list = new ArrayList<>();
      for (int i = 0; i < relation.length; i++) {
        list.add(relation[i][pos]);
      }
      columnMap.put("" + column.charAt(0), list);
    }
    visit.add(column);

    for (int i = index + 1; i < length; i++) {
      char col = (char) (column.charAt(0) + i);
      dfs(column + col, i, length, relation);
    }
  }
}
