package programmers.skillTree;

import java.util.stream.Stream;

public class Solution {

  public int solution(String skill, String[] skillTree) {
    return (int) Stream.of(skillTree).filter(x -> x.contains(skill)).count();
  }
}
