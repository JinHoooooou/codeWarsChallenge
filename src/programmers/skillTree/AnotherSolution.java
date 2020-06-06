package programmers.skillTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AnotherSolution {

  public int solution(String skillOrder, String[] skillTrees) {
    int answer = 0;
    ArrayList<String> skillTree = new ArrayList<String>(Arrays.asList(skillTrees));
    Iterator<String> it = skillTree.iterator();

    while (it.hasNext()) {
      String erase = it.next().replaceAll("[^" + skillOrder + "]", "");
      int order = skillOrder.indexOf(erase);
      if (skillOrder.indexOf(erase) != 0) {
        it.remove();
      }
    }
    answer = skillTree.size();
    return answer;
  }
}
