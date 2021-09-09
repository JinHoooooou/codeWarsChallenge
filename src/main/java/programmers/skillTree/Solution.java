package programmers.skillTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public int solution(String skillOrder, String[] skillTrees) {

    int count = 0;
    for (String skillTree : skillTrees) {
      Queue<Character> skillTreeQueue = getSkillTreeQueue(skillTree, skillOrder);
      Queue<Character> skillOrderQueue = getSkillOrderQueue(skillOrder);

      while (!skillTreeQueue.isEmpty()) {
        if (skillOrderQueue.element() == skillTreeQueue.element()) {
          skillTreeQueue.remove();
          skillOrderQueue.remove();
        } else {
          break;
        }
      }

      if (skillTreeQueue.isEmpty()) {
        count++;
      }
    }
    return count;
  }

  private Queue<Character> getSkillOrderQueue(String skillOrder) {
    Queue<Character> skillOrderQueue = new LinkedList<>();
    for (int i = 0; i < skillOrder.length(); i++) {
      skillOrderQueue.offer(skillOrder.charAt(i));
    }
    return skillOrderQueue;
  }

  private Queue<Character> getSkillTreeQueue(String skillTree, String skillOrder) {
    Queue<Character> skillOrderQueue = new LinkedList<>();
    for (char eachSkill : skillTree.toCharArray()) {
      if (skillOrder.indexOf(eachSkill) != -1) {
        skillOrderQueue.offer(eachSkill);
      }
    }
    return skillOrderQueue;
  }
}
