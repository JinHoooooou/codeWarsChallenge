package doNotSolve.programmers.level2.후보기;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

  ArrayList<HashSet<Integer>> candidates;

  public int solution(String[][] relation) {
    candidates = new ArrayList<>();
    for (int i = 1; i <= relation[0].length; i++) {
      HashSet<Integer> set = new HashSet<>();
      select(i, 0, 0, relation, set);
    }

    return candidates.size();
  }

  private void select(int groupCount, int currentGroupCount, int currentCol, String[][] relation,
      HashSet<Integer> groups) {

    if (currentGroupCount == groupCount) {
      if (!containCandidateKey(groups) && isCandidateKey(relation, groups)) {
        candidates.add(groups);
      }
      return;
    }

    for (int i = currentCol; i < relation[0].length; i++) {
      HashSet<Integer> newGroups = new HashSet<>(groups);
      newGroups.add(i);
      select(groupCount, currentGroupCount + 1, i + 1, relation, newGroups);
    }
  }

  private boolean isCandidateKey(String[][] relation, HashSet<Integer> groups) {
    HashSet<String> set = new HashSet<>();
    for (int row = 0; row < relation.length; row++) {
      String elements = "";
      for (int col : groups) {
        elements += relation[row][col] + ",";
      }
      set.add(elements);
    }

    return set.size() == relation.length;
  }

  private boolean containCandidateKey(HashSet<Integer> groups) {
    for (int i = 0; i < candidates.size(); i++) {
      if (groups.containsAll(candidates.get(i))) {
        return true;
      }
    }
    return false;
  }
}
