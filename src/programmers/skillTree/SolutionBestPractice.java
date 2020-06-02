package programmers.skillTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SolutionBestPractice {

  public int solution(String skill, String[] skill_trees) {
    int answer = 0;
    ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
    Iterator<String> it = skillTrees.iterator();

    while (it.hasNext()) {
      if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
        it.remove();
      }
    }
    answer = skillTrees.size();
    return answer;
  }
}
